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

    public List<Categoria> buscaTodasCategorias(int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        return categoriaDAO.buscaTodos(idUsuario);
    }
    public Categoria buscaCategoriaPorId(int id,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        return categoriaDAO.buscaPorId(id,idUsuario);
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
    
    public void alteraCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.altera(categoria);;
    }

    public List<Produto> buscaTodosProdutos(int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaTodos(idUsuario);
    }

    public List<Produto> buscaProdutosPorCategoria(Categoria categoria,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaPorCategoria(categoria,idUsuario);
    }
    
    public Produto buscaProdutosPorId(int id,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaPorId(id,idUsuario);
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

    public Parcela buscaParcelaPorCodigo(int id, int idConta,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaPorParcela(id, idConta,idUsuario);
    }
    
    public List<Parcela> buscaParcelaPorConta(int idConta,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaParcelasDaConta(idConta, idUsuario);
    }

    public Renegociacao buscaRenegociacaoPorCodigo(int id, int idParcela, int idConta,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorCodigo(id, idParcela, idConta,idUsuario);
    }
    public List<Renegociacao> buscaRenegociacaoPorParcela(int idParcela, int idConta,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorParcela(idParcela, idConta,idUsuario);
    }
    public List<Renegociacao> buscaRenegociacaoPorConta(int idConta,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorConta(idConta,idUsuario);
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
    
    public Usuario buscaUsuarioPorId(int id) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaPorId(id);
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

    public List<Fornecedor> buscaTodosFornecedor(int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        FornecedorDAO fornecedorDAO = fabrica.getForncedorDAO();
        return fornecedorDAO.buscaTodos(idUsuario);
    }

    public Fornecedor buscaFornecedor(String nomeFornecedor,int idUsuario) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        FornecedorDAO fornecedorDAO = fabrica.getForncedorDAO();
        return fornecedorDAO.buscaFornecedor(nomeFornecedor,idUsuario);
    }

    public void insereFornecedor(Fornecedor fornecedor) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        FornecedorDAO fornecedorDAO = fabrica.getForncedorDAO();
        fornecedorDAO.insere(fornecedor);
    }

    public void removeFornecedor(Fornecedor fornecedor) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        FornecedorDAO fornecedorDAO = fabrica.getForncedorDAO();
        fornecedorDAO.remove(fornecedor);
    }

    public void alteraFornecedor(Fornecedor fornecedor) {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        FornecedorDAO fornecedorDAO = fabrica.getForncedorDAO();
        fornecedorDAO.altera(fornecedor);
    }
    
    public Conta buscaConta(int id, int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        return contaDAO.buscaConta(id, idUsuario);
    }

    public List<Conta> buscaTodasContas(int idUsuario)
    {
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        return contaDAO.buscaTodos(idUsuario);
    }
    
    public int buscaUltimoIdDaConta(int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        return contaDAO.buscaUltimoIdDaConta(idUsuario);
    }

    public List<Conta> buscaContaPorTipo(int tipo, int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        return contaDAO.buscaContaPorTipo(tipo, idUsuario);
    }

	public void insereConta(Conta conta){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        contaDAO.insere(conta);
    }

    public void removeConta(Conta conta){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        contaDAO.remove(conta);
    }

    public void alteraConta(Conta conta){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        contaDAO.altera(conta);
    }
    
    public Parcela buscaPorParcela(int id, int idConta,int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaPorParcela(id, idConta,idUsuario);
    }

    public List<Parcela> buscaParcelasDaConta(int idConta,int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaParcelasDaConta(idConta,idUsuario);
    }
    public List<Parcela> buscaParcelasDoUsuario(int idUsuario){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaParcelasDoUsuario(idUsuario);
    }
    
    
    public void insereParcelas(List<Parcela> parcelas){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        parcelaDAO.insere(parcelas);
    }

    public void removeParcelas(Parcela parcela){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        parcelaDAO.remove(parcela);
    }

    public void alteraParcelas(Parcela parcela){
        DAOFactory fabrica = PostgresqlDBFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        parcelaDAO.altera(parcela);
        
    }
}
