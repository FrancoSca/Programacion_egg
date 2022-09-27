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
public class NewMain6extra {

    /**
     * @param args the command line arguments Leer la altura de N personas y
     * determinar el promedio de estaturas que se encuentran por debajo de 1.60
     * mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas a censar");
        int N = leer.nextInt();
        int estatura = 0;
        int sumageneral = 0;
        int suma160 = 0;
        int metro60 = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("ingrese la estatura de " + (i + 1) + " persona en cm ");
            estatura = leer.nextInt();
            sumageneral += estatura;
            if (estatura < 160) {
                suma160++;
                metro60 += estatura;
            }
        }
        System.out.println("el promedio de estaturas general es "+(float)sumageneral/N);
        System.out.println("el promedio por debajo del 1.60mts es "+(float)metro60/suma160);
    }

}
