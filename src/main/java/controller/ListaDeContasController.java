/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.ListaDeContas;

public class ListaDeContasController {

    public void chamarTela()
    {
        ListaDeContas lista = new ListaDeContas();
        lista.exibir();
    }
}
