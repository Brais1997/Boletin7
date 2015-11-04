/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
class NumeroPositivo {
      int num;
    public void pedirNum(){
       num=Integer.parseInt( JOptionPane.showInputDialog("Inserte número"));
        
        if(num >= 0){
            JOptionPane.showMessageDialog(null, "É positivo");            
        }
        else 
            JOptionPane.showMessageDialog(null, "Pringao"); 
    }
}
