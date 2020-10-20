package dao;

import java.util.List;

import model.Renegociacao;

public interface RenegociacaoDAO {

    Renegociacao buscaPorCodigo(int id, int idParcela, int idConta);
    
    List<Renegociacao> buscaPorParcela(int idParcela, int idConta);
    
    List<Renegociacao> buscaPorConta(int idConta);

    void insere(Renegociacao renegociacao);

    void remove(Renegociacao renegociacao);

    void altera(Renegociacao renegociacao);
}
