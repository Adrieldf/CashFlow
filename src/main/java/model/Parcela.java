/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOFactory;
import dao.ParcelaDAO;
import database.PostgresqlDAOFactory;
import java.util.List;


public class Parcela 
{
    public int numeroConta;
    public int numParcela;
    public String data;
    public float valorTotal;
    public float valorPago;
    public String finalizada;
   /*
    public List<Parcela> buscaTodasParcelas()
    {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ParcelaDAO parcelaDAO = fabrica.getParcelaDAO();
        return parcelaDAO.buscaTodasParcelas();
    }
    */
}
