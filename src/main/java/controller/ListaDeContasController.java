/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Conta;
import view.ListaDeContas;
import controller.ContaController;
import model.Parcela;

public class ListaDeContasController {
    
    public List<Conta> listaContas = new ArrayList<Conta>();
    public List<Parcela> listaParcela = new ArrayList<Parcela>();

    public void chamarTela()
    {   
        ListaDeContas lista = new ListaDeContas();
        lista.exibir();
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public List<Parcela> getListaParcela() {
        return listaParcela;
    }

    public void setListaParcela(List<Parcela> listaParcela) {
        this.listaParcela = listaParcela;
    }

    
    
}
