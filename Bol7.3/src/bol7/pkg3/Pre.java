/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
public class Pre {
    public void negPos(){
    int num =Integer.parseInt(JOptionPane.showInputDialog("Número"));
    if(num>0){
        JOptionPane.showMessageDialog(null, "+");  
       
    }
    else  if (num<0){
       
     JOptionPane.showMessageDialog(null, "-"); 
        
    }
    else{
        JOptionPane.showMessageDialog(null, "0"); 
    }
    
}
}
