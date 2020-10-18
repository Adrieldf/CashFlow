package model;

public class ClienteFornecedor extends Pessoa {
	
	private int id;
        private String nome;
        private boolean fornecedor;
        
	public ClienteFornecedor() {
		super();
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
