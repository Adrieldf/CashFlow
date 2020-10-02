/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Principal;

public class TelaPrincipalController {
    
    public void chamarTela()
    {
        Principal principal = new Principal();
        principal.exibir();
    }
    
}
