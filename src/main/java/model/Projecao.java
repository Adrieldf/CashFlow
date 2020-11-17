/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;


public class Projecao {
    
    LocalDate data;
    private double valor;
    private double valorPago;

    public Projecao(LocalDate data, double valor, double valorPago) {
        this.data = data;
        this.valor = valor;
        this.valorPago = valorPago;
    }
    
}
