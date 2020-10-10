package dao;

import java.util.List;

import model.Empresa;

public interface EmpresaDAO {

    List<Empresa> buscaTodas();

    List<Empresa> buscaPorNome(String nome);

    void insere(Empresa empresa);

    void remove(Empresa empresa);

    void altera(Empresa empresa);
}
