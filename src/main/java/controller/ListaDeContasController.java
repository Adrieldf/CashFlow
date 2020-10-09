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
import model.DadosListaDeContas;

public class ListaDeContasController {
    
    public List<DadosListaDeContas> contas = new ArrayList<DadosListaDeContas>();

    public void chamarTela()
    {
        ListaDeContas lista = new ListaDeContas();
        lista.exibir();
    }
    
    public void buscaContas(){
        Conta conta = new Conta();
        ajustaDados(conta.buscaContas());
    }
    
    public void ajustaDados(List<Conta> lista)
    {
        
    }

    public List<DadosListaDeContas> getContas() {
        return contas;
    }

    public void setContas(List<DadosListaDeContas> contas) {
        this.contas = contas;
    }
    
}
