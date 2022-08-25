/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra7DoWhile {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int max =0;
        int min = 100;
        int n = leer.nextInt();
        int tot =0;
        int cont =0;
        do {
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            tot +=num;
            cont ++;
            if (num>max) {
                max = num;
            }
            if (num<min) {
                min=num;
                
            }
            
        }while (n>cont);
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minino es: " + min);
        System.out.println("El promedio de los numeros ingresados es: " + (double)tot/n);
    }
    
}
