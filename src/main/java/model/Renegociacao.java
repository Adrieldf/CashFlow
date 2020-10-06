package model;

public class Renegociacao extends Parcela{

	private int id;
	private int novaData;
	private float novoValor;
	private String descricao;
	private boolean valida;
	
	public Renegociacao(int novaData, float novoValor, String descricao) {
		super();
		this.setNovaData(novaData);
		this.setNovoValor(novoValor);
		this.setDescricao(descricao);
		this.setValida(true);//quando cria a renegociação é sempre valida, depois que pode invalidar
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNovaData() {
		return novaData;
	}
	public void setNovaData(int novaData) {
		this.novaData = novaData;
	}
	public float getNovoValor() {
		return novoValor;
	}
	public void setNovoValor(float novoValor) {
		this.novoValor = novoValor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isValida() {
		return valida;
	}
	public void setValida(boolean valida) {
		this.valida = valida;
	}
	
}
