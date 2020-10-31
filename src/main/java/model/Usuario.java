package model;

public class Usuario extends Pessoa {

	private String login;
	private String senha;
        private int idUsuario;
	
	
	public Usuario(String login, String senha) {
		super();
		
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
