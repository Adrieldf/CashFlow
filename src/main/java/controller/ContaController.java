package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Conta;

public class ContaController {
    
    
    public List<Conta> buscaTodos()
    {
        Conta conta = new Conta();
        return conta.buscaContas();
    }

}
