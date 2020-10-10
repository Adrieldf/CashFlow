/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Produto;
import view.*;

public class CadastroProdutoController {

    public void chamarTela() {
        CadastroProduto produto = new CadastroProduto();
        produto.exibir();
    }

}
