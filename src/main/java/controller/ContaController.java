package controller;

import javax.swing.table.DefaultTableModel;
import model.DadosListaDeContas;

public class ContaController {
    
    public void executaFiltro(int conta, boolean receber, boolean pagar, boolean nPagas, boolean pagas, boolean renegociadas, boolean atrasadas,  DefaultTableModel grid)
    {
        DadosListaDeContas dados = new DadosListaDeContas();
        String query = dados.montaQuery(conta, receber, pagar, nPagas, pagas, renegociadas, atrasadas);
    }

}
