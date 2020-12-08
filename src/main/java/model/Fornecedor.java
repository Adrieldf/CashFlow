/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Fornecedor extends Pessoa{
    
    private int idUsuario;

    public Fornecedor(int id, String nome, String telefone, String email, String endereco, int idUsuario) {
    	super(id, nome,telefone, email, endereco);
        this.setIdUsuario(idUsuario);
    }
    public Fornecedor(String nome, String telefone, String email, String endereco, int idUsuario) {
    	super(nome,telefone, email, endereco);
        this.setIdUsuario(idUsuario);
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
    
}
