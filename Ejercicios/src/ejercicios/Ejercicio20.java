/
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese los 9 numeros para llenar el cuadro: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = leer.nextInt();
                matriz[i][j] = num;
            }  
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0 && i==2) {
                    System.out.print(matriz[i][j] + "   ");
                } else
                    System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        sumLineas(matriz);
    }
    public static void sumLineas(int [][] matriz) {
       int sumlin1 =0;
       int sumcol1 =0;
       int sumdiag1 =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                    sumlin1 += matriz[i][j]; 
                }else if (j==0){
                    sumcol1 += matriz[i][j];
                } else if (i==j) {
                    sumdiag1 += matriz[i][j];  
            }
            }
        }
        if (sumlin1 == sumcol1 || sumlin1 == sumdiag1 || sumcol1 == sumdiag1) {
            System.out.println("Su cuadro es magico !!");
        } else {
            System.out.println("Su cuadro no es magico !!");
        }
        
    }
    
}
