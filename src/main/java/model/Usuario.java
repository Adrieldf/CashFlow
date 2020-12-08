package model;

public class Usuario extends Pessoa {

	private String login;
	private String senha;

	public Usuario(int id,String login, String senha, String nome, String telefone, String email, String endereco) {
		super(id, nome, telefone,email,endereco);
		
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public Usuario(String login, String senha, String nome, String telefone, String email, String endereco) {
		super(nome, telefone,email,endereco);
		
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public Usuario() {
		super();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
