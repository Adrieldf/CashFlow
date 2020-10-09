package model;

import dao.ContaDAO;
import dao.DAOFactory;
import database.PostgresqlDAOFactory;
import java.util.ArrayList;
import java.util.List;

public class Conta 
{
    public int numero;
    public int tipo; //1 pagar; 2 receber
    public ArrayList<Parcela> parcela = new ArrayList<Parcela>();
    public Produto produto;
    public float valor;
    public boolean finalizada;
    public boolean renegociada;
    
     public List<Conta> buscaContas()
    {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ContaDAO contaDAO = fabrica.getContaDAO();
        return contaDAO.buscaTodos();
    }
}
