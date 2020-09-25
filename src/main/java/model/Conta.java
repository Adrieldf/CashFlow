package model;

import java.util.ArrayList;

public class Conta 
{
    public int numero;
    public int tipo; //1 pagar; 2 receber
    public ArrayList<Parcela> parcela = new ArrayList<Parcela>();

}
