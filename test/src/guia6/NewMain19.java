/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Random;



/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class NewMain19 {

    public static void main(String[] args) {
            int matriz[][] = new int[3][3]; // Le ponemos la dimension a la matriz, 
            Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j] = rnd.nextInt(20-(-10)+1)-10;
                // en sus filas

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }    

        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j]=matriz[i][j]*-1;
                System.out.print("[" + matriz[j][i] + "]");

            }
            System.out.println(" ");    
        }
    }
    
}
