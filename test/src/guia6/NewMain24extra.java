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
public class NewMain24extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija hasta que posicion de la sucesion de Fibonacci quiere ver: ");
        int pos = leer.nextInt();
        int[] vector = new int[pos];

        for (int i = 0; i < pos; i++) {
            vector[i] = nroFibo(i);
        }

        System.out.println("Los numeros de Fibonacci hasta la posicion " + pos + " son :");
        for (int i = 0; i < pos; i++) {
            System.out.print(vector[i] + " ");
            System.out.println("");
        }
    }

    public static int nroFibo(int n) {
        int suma = 0;
        if (n <= 1) {
            suma += 1;
        } else {
            suma = nroFibo(n - 2) + nroFibo(n - 1);
        }
        return suma;
    }

}
