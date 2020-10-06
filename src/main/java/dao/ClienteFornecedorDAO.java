package dao;

import java.util.List;

import model.ClienteFornecedor;

public interface ClienteFornecedorDAO {
	
	List<ClienteFornecedor> buscaTodas();
	List<ClienteFornecedor> buscaPorNome(String nome);
    void insere(ClienteFornecedor clienteFornecedor);
    void remove(ClienteFornecedor clienteFornecedor);
    void altera(ClienteFornecedor clienteFornecedor);
    
}
