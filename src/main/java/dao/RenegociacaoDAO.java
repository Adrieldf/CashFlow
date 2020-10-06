package dao;

import java.util.List;

import model.Renegociacao;

public interface RenegociacaoDAO {

	List<Renegociacao> buscaTodas();
	List<Renegociacao> buscaPorCodigo(int id);
    void insere(Renegociacao renegociacao);
    void remove(Renegociacao renegociacao);
    void altera(Renegociacao renegociacao);
}
