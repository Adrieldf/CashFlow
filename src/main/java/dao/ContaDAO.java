/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Conta;
import java.util.List;

public interface ContaDAO {

    Conta buscaConta(int numConta);

    List<Conta> buscaTodos();

    List<Conta> buscaContaPorTipo(int tipo);

    void insere(Conta conta);

    void remove(Conta conta);

    void altera(Conta conta);

}
