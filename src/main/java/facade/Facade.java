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
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        return categoriaDAO.buscaTodos();
    }

    public void insereCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.insere(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.remove(categoria);
    }

    public List<Produto> buscaTodosProdutos() {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaTodos();
    }

    public List<Produto> buscaProdutosPorCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaPorCategoria(categoria);
    }

    public void insereProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.insere(produto);
    }

    public void alteraProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.altera(produto);
    }

    public void removeProdutos(Produto produto) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.remove(produto);
    }

    public Parcela buscaParcelaPorCodigo(int id, int idConta) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaPorParcela(id, idConta);
    }
    
    public List<Parcela> buscaParcelaPorConta(int idConta) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaParcelasDaConta(idConta);
    }

    public Renegociacao buscaRenegociacaoPorCodigo(int id, int idParcela, int idConta) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorCodigo(id, idParcela, idConta);
    }
    public List<Renegociacao> buscaRenegociacaoPorParcela(int idParcela, int idConta) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorParcela(idParcela, idConta);
    }
    public List<Renegociacao> buscaRenegociacaoPorConta(int idConta) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorConta(idConta);
    }

    public void insereRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.insere(renegociacao);
    }

    public void removeRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.remove(renegociacao);
    }

    public void alteraRenegociacao(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.altera(renegociacao);
    }

    public List<Usuario> buscaTodosUsuario() {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaTodos();
    }

    public Usuario buscaUsuarioPorLogin(String login) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaPorLogin(login);
    }

    public void insereUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.insere(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.remove(usuario);
    }

    public void alteraUsuario(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.altera(usuario);
    }

    public List<Pessoa> buscaTodasPessoas() {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        return pessoaDAO.buscaTodas();
    }

    public List<Pessoa> buscaPessoaPorNome(String nome) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        return pessoaDAO.buscaPorNome(nome);
    }
    
    public Pessoa buscaPessoaPorId(int id) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        return pessoaDAO.buscaPorId(id);
    }

    public void inserePessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.insere(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.remove(pessoa);
    }

    public void alteraessoa(Pessoa pessoa) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        PessoaDAO pessoaDAO = fabrica.getPessoaDAO();
        pessoaDAO.altera(pessoa);
    }
}
