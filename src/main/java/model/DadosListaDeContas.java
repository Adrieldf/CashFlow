/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class DadosListaDeContas {

    public String tipo; //1 pagar; 2 receber
    public int numero;
    public float valor;
    public String produto;
    public boolean efetuado;
    public boolean renegociado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public boolean isEfetuado() {
        return efetuado;
    }

    public void setEfetuado(boolean efetuado) {
        this.efetuado = efetuado;
    }

    public boolean isRenegociado() {
        return renegociado;
    }

    public void setRenegociado(boolean renegociado) {
        this.renegociado = renegociado;
    }
    
    public String montaQuery(int conta, boolean receber, boolean pagar, boolean nPagas, boolean pagas, boolean renegociadas, boolean atrasadas)
    {
        String query = new String();
        return query;
    }
    
}
