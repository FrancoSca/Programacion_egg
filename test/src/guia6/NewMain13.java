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
public class NewMain13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para formar un cuadrado");
        int tam = leer.nextInt();
        //int lados = tam;
        for(int i=0; i < tam; i++){
        System.out.print("* ");
        }
         System.out.println(" ");
        for(int j=2; j < tam; j++){
            System.out.print("* ");
          
            for(int i=2; i < tam; i++){
                System.out.print("  ");
        }
         System.out.print("* ");
         System.out.println(" ");
    }
         for(int i=0; i < tam; i++){
        System.out.print("* ");
        }
    } 
}
        