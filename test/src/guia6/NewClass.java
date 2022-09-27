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
public class NewClass {
    
  



/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/



     public static void main(String[] args) {
       
    
        Scanner leer = new Scanner (System.in);
        int n1,n2,n3;
        //n1=0;
        //n2=0;
            System.out.println("Ingrese primer numero");
            n1 = leer.nextInt();
            System.out.println("Ingrese segundo numero");
        n2 = leer.nextInt();
        n3 = n1+n2;
         System.out.println("la suma es: "+n3);
        
        
                
    }
    
}

    

