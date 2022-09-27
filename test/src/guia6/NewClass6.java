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
public class NewClass6 {
    
      /**
Crear un programa que dado un numero determine si es par o impar.
     * @param args
 */


 
    public static void main(String[] args) {
      
        System.out.println("ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        int n;
        n= leer.nextInt();
        if (n%2 == 0){
        System.out.println("el numero es Par");
        }
        else{
            System.out.println("el munero es Impar");    
        }
       
        
        
    }
}
    




