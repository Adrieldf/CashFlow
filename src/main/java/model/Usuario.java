package model;

public class Usuario extends Pessoa {

	private int id;
	private String login;
	private String senha;
	private int idPessoa;
	
	
	public Usuario(String nome, String login, String senha) {
		super(nome);
		
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public Usuario() {
		super();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	
}
