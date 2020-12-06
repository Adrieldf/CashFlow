/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Parcela;

public interface ParcelaDAO {

    Parcela buscaPorParcela(int id, int idConta, int idUsuario);

    List<Parcela> buscaParcelasDaConta(int idConta, int idUsuario);
    
    List<Parcela> buscaParcelasDoUsuario(int idUsuario);
    
    void insere(List<Parcela> parcelas);

    void remove(Parcela parcela);

    void altera(Parcela parcela);

}
