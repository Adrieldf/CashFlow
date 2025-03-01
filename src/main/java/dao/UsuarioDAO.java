package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDAO {

    List<Usuario> buscaTodos();

    Usuario buscaPorLogin(String login);
    
    Usuario buscaPorId(int id);

    void insere(Usuario usuario);

    void remove(Usuario usuario);

    void altera(Usuario usuario);

}
