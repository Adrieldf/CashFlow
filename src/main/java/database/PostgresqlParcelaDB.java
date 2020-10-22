/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ParcelaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Parcela;

public class PostgresqlParcelaDB implements ParcelaDAO{
    
    private Connection conn;
    
    public PostgresqlParcelaDB(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Parcela buscaPorParcela(int id, int idConta) {
    	List<Parcela> parcelas = new ArrayList<Parcela>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from parcela where id = ? and \"idConta\" = ?");
			pstmt.setInt(1, id);
			pstmt.setInt(2, idConta);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Parcela p = new Parcela();
				p.setId(rs.getInt("id"));
				p.setIdConta(rs.getInt("idConta"));
				//p.setData(rs.getInt("data"));
				p.setValor(rs.getDouble("valor"));
				p.setValorPago(rs.getDouble("valorPago"));
				p.setDesconto(rs.getDouble("desconto"));
				parcelas.add(p);
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

		return parcelas.get(0);
    }

    @Override
    public List<Parcela> buscaParcelasDaConta(int idConta) {
    	List<Parcela> parcelas = new ArrayList<Parcela>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from parcela where \"idConta\" = ?");
			pstmt.setInt(1, idConta);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Parcela p = new Parcela();
				p.setId(rs.getInt("id"));
				p.setIdConta(rs.getInt("idConta"));
				//p.setData(rs.getInt("data"));
				p.setValor(rs.getDouble("valor"));
				p.setValorPago(rs.getDouble("valorPago"));
				p.setDesconto(rs.getDouble("desconto"));
				parcelas.add(p);
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

		return parcelas;
    }

    @Override
    public void insere(Parcela parcela) {
    	if (parcela == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(
					"insert into parcela (\"idConta\", data, valor, valorPago, desconto) values (?, ?, ?, ?, ?)");

			pstmt.setInt(1, parcela.getIdConta());
			//pstmt.setInt(2, parcela.getData());
			pstmt.setDouble(3, parcela.getValor());
			pstmt.setDouble(4, parcela.getValorPago());
			pstmt.setDouble(5, parcela.getDesconto());

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
    public void remove(Parcela parcela) {
    	if (parcela == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("delete from parcela where id = ? and \"idConta\" = ?");
			pstmt.setInt(1, parcela.getId());
			pstmt.setInt(2, parcela.getIdConta());
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
    public void altera(Parcela parcela) {
    	if (parcela == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("update parcela set data = ?, valor = ?, valorPago = ?, desconto = ? where id = ? and \"idConta\" = ?");

			
			//pstmt.setInt(1, parcela.getData());
			pstmt.setDouble(2, parcela.getValor());
			pstmt.setDouble(3, parcela.getValorPago());
			pstmt.setDouble(4, parcela.getDesconto());
			pstmt.setInt(5, parcela.getId());
			pstmt.setInt(6, parcela.getIdConta());

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
