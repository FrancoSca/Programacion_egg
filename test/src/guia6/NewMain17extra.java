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
public class NewMain17extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int nro = leer.nextInt();

        if (esPrimo(nro)) {
            System.out.println(nro + " es primo.");
        } else {
            System.out.println(nro + " NO es primo.");
        }
    }

    public static boolean esPrimo(int N) {
        boolean primo = true;

        for (int i = 2; i <= N / 2 + 1; i++) {
            if (N % i != 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

}
