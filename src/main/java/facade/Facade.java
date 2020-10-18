/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.*;
import database.*;
import java.util.List;
import model.*;

public class Facade {

    public List<Categoria> buscaTodasCategorias() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        return categoriaDAO.buscaTodos();
    }

    public void insereCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.insere(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.remove(categoria);
    }

    public List<ClienteFornecedor> buscaTodosClienteFornecedor() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        return clienteFornecedorDAO.buscaTodas();
    }

    public List<ClienteFornecedor> buscaClienteFornecedorPorNome(String nome) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        return clienteFornecedorDAO.buscaPorNome(nome);
    }

    public void insereClienteFornecedor(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.insere(clienteFornecedor);
    }

    public void removeClienteFornecedor(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.altera(clienteFornecedor);
    }

    public void alteraClienteFornecedor(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.remove(clienteFornecedor);
    }

    public List<Produto> buscaTodosProdutos() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaTodos();
    }

    public List<Produto> buscaProdutosPorCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaPorCategoria(categoria);
    }

    public void insereProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.insere(produto);
    }

    public void alteraProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.altera(produto);
    }

    public void removeProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.remove(produto);
    }

    public List<Renegociacao> buscaTodasRenegociacao() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaTodas();
    }

    public List<Renegociacao> buscaRenegociacaoPorCodigo(int id) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorCodigo(id);
    }

    public void insereRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.insere(renegociacao);
    }

    public void removeRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.remove(renegociacao);
    }

    public void alteraRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.altera(renegociacao);
    }

    public List<Usuario> buscaTodosUsuario() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaTodos();
    }

    public Usuario buscaUsuarioPorLogin(String login) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaPorLogin(login);
    }

    public void insereUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.insere(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.remove(usuario);
    }

    public void alteraUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.altera(usuario);
    }

    public List<Pessoa> buscaTodasPessoas() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        return pessoaDAO.buscaTodas();
    }

    public List<Pessoa> buscaPessoaPorNome(String nome) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        return pessoaDAO.buscaPorNome(nome);
    }

    public void inserePessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.insere(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.remove(pessoa);
    }

    public void alteraessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.altera(pessoa);
    }
}
