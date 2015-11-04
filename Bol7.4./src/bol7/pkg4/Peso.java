/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
public class Peso {
    public void peso(){
        String nome1= JOptionPane.showInputDialog("1º Nome");
        String nome2= JOptionPane.showInputDialog("2º Nome");
        float peso1=Float.valueOf(JOptionPane.showInputDialog("Peso do 1º"));
        float peso2 =Float.valueOf(JOptionPane.showInputDialog("Peso do 2º"));
        if(peso1>peso2){
            JOptionPane.showMessageDialog(null, " Pesa mais " +nome1+ " con " +peso1+ "Kg que " +nome2+ " con " +peso2+"Kg");
                    JOptionPane.showMessageDialog(null, "A diferenza de peso é de:" +(peso1-peso2)+ " Kg");

    }
        else{
            JOptionPane.showMessageDialog(null,  "Pesa mais "+nome2+" con "+peso2+" Kg que "+nome1+" con "+peso1+"Kg");
             JOptionPane.showMessageDialog(null, "A diferenza de peso é de:" +(peso2-peso1)+ "Kg");
        }
        
}
}
