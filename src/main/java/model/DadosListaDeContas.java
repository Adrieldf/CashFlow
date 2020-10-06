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
    public String categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public String montaWhere(int conta, boolean receber, boolean pagar, boolean nPagas, boolean pagas, boolean renegociadas, boolean atrasadas) {
        String query = "where";
        boolean addAnd = false;

        if (conta > 0) {
            query = query + " conta =" + conta;
            addAnd = true;
        }
        
        if (receber != pagar) {
            if(addAnd){
                query = query + " and";
            }
            if(receber){
                query = query + " tipo =" + "1";addAnd = true;
            }
            else
            {
                query = query + " tipo =" + "2";addAnd = true;
            }
        }
        
        if (nPagas != pagas) {
            if(addAnd){
                query = query + " and";
            }
            if(nPagas){
                query = query + " finalizada =" + "is null";addAnd = true;
            }
            else
            {
                query = query + " finalizada =" + "is not null";addAnd = true;
            }
        }

        return query;
    }

}
