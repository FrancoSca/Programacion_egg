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
public class NewMain16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10+1);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
           System.out.println("Ingrese el número que está buscando:"); 
           int num = leer.nextInt();
           int j = 0;
           for (int i = 0; i < N; i++) {
               if (vector[i] == num){
                   System.out.println("Su número se encuentra en la posición " +i );
               j= j+1;
                 }
                             
           }
           if (j>1){
           System.out.println("El número está repetido " +j+ " veces.");
            } else if(j==1){
           System.out.println("El número se encuentra una vez en el vector.");
           
    }      else{
           System.out.println("El número no se encuentra en el vector.");
           }
           
    }
}
