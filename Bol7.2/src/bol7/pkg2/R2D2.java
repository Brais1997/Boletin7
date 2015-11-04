/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
public class R2D2 {
    short num1;
    short num2;
   public void numer(){
      num1=Short.parseShort(JOptionPane.showInputDialog("Inserte número 1"));
      num2=Short.parseShort(JOptionPane.showInputDialog("Inserte número 2"));
       if(num1<=num2){
          
       }
       else  JOptionPane.showMessageDialog(null,"A resta é " + (num1-num2));
       JOptionPane.showMessageDialog(null,"A suma é " + (num1+num2));
       
   }
}
