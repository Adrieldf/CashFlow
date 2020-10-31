/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOFactory;
import dao.ParcelaDAO;
import database.PostgresqlDBFactory;
import java.time.LocalDate;
import java.util.List;

public class Parcela {
	private int id;
	private int idConta;
	private String data;
	private double valor;
	private double valorPago;
	private double desconto;
	public boolean renegociada;
	private int idUsuario;

	public Parcela() {
		
	}
	public Parcela(int id, int idConta, String data, double valor, double valorPago, double desconto, int idUsuario) {
		this.setId(id);
		this.setIdConta(idConta);
		this.setData(data);
		this.setValor(valor);
		this.setValorPago(valorPago);
		this.setDesconto(desconto);
		this.setIdUsuario(idUsuario);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
