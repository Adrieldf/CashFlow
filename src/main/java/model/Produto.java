/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Produto
{
    private String nomeProduto;
    private Categoria categoria;

    public Produto(String nome, Categoria categoria)
    {
        nomeProduto = nome;
        this.categoria = categoria;
    }
}
