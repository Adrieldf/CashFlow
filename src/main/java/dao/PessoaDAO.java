package dao;

import java.util.List;

import model.Pessoa;

public interface PessoaDAO {

    List<Pessoa> buscaTodas();

    List<Pessoa> buscaPorNome(String nome);

    void insere(Pessoa pessoa);

    void remove(Pessoa pessoa);

    void altera(Pessoa pessoa);

}
