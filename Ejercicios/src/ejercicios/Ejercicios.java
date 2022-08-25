/*
 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = leer.nextInt();
        int suma = num1+ num2;
        System.out.println("La suma de los 2 numeros es igual a " +suma);
    }
    
}
