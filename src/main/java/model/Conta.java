package model;

import dao.ContaDAO;
import dao.DAOFactory;
import database.PostgresqlDBFactory;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    //atributos do banco
    private int id;
    private int tipo; //1 pagar; 2 receber
    private int idFornecedor;
    private int idUsuario;
    private String descricao;
    private int idProduto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getTipoString() {
		if(this.getTipo() == 2)
			return "A receber";
		if(this.getTipo() == 1)
			return "A pagar";
		
		return "";
	}
}
