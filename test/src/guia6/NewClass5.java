/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Samu Noah
 */
public class NewClass5 {
    
    /**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args
 */


 
    public static void main(String[] args) {
   System.out.println("Ingresa un numero");   
    Scanner leer  = new Scanner(System.in);
    int num,d,t;
    double rc;
     num = leer.nextInt();
     d= num*2;
     t= num*3;
     rc= Math.sqrt(num);
     
        System.out.println("El doble es; "+d);
         System.out.println("El triple es; "+t);
          System.out.println("La RC es; "+rc);
    }
    
}


