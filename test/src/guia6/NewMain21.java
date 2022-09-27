/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Random;

/**
 *
 * @author Samu Noah
 */
public class NewMain21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
         */
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        Random azar = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = azar.nextInt(1 + 1) - 0;
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("**************");
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                matrizP[k][m] = azar.nextInt(1 + 1) - 0;
                System.out.print("[" + matrizP[k][m] + "]");
            }
            System.out.println("");
        }

        boolean esta = false;
        int colu = 0;
        int fila = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matrizM[i][j] == matrizP[0][0]) {
                    System.out.println("encontre 1° elemento 1°fila " + i + " " + j);

                    if (matrizM[i][j + 1] == matrizP[0][1]) {
                        System.out.println("encontre 2° elemento 1° fila " + i + " " + (j + 1));

                        if (matrizM[i][j + 2] == matrizP[0][2]) {
                            System.out.println("encontre 3° elemento 1° fila  " + i + " " + (j + 2));

                            if (matrizM[i + 1][j] == matrizP[1][0]) {
                                System.out.println("encontre 1° elemento 2° fila  " + (i + 1) + " " + j);

                                if (matrizM[i + 1][j + 1] == matrizP[1][1]) {
                                    System.out.println("encontre 2° elemento 2° fila  " + (i + 1) + " " + (j + 1));

                                    if (matrizM[i + 1][j + 2] == matrizP[1][2]) {
                                        System.out.println("encontre 3° elemento 2° fila  " + (i + 1) + " " + (j + 2));

                                        if (matrizM[i + 2][j] == matrizP[2][0]) {
                                            System.out.println("encontre 1° elemento 3° fila  " + (i + 2) + " " + j);

                                            if (matrizM[i + 2][j + 1] == matrizP[2][1]) {
                                                System.out.println("encontre 2° elemento 3° fila  " + (i + 2) + " " + (j + 1));

                                                if (matrizM[i + 2][j + 2] == matrizP[2][2]) {
                                                    System.out.println("encontre 3° elemento 3° fila  " + (i + 2) + " " + (j + 2));
                                                    esta = true;
                                                    fila = i;
                                                    colu = j;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (esta == true) {
                    System.out.println("Está incluida....");
                    System.out.println("la submatriz empieza en las coordenadas " + fila + " " + colu);
                    break;
                }
            }
        }
        if (esta == false) {
            System.out.println("No está incluida....");
        }

    }

}
