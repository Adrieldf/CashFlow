/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Parcela;

public interface ParcelaDAO {

    Parcela buscaPorParcela(int parcela);

    List<Parcela> buscaParcelasDaConta(int numeroConta);

    List<Parcela> buscaTodasParcelas();

    void insere(Parcela parcela);

    void remove(Parcela parcela);

    void altera(Parcela parcela);

}
