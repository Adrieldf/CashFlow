/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Parcela;


public class ParcelaController {
    
    public List<Parcela> buscaTodos()
    {
        Parcela parcela = new Parcela();
        return parcela.buscaTodasParcelas();
    }
    
}
