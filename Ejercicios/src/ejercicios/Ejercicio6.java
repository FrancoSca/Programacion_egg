/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("El numero ingresado es par.");
            
        } else {
            System.out.println("El numero es impar.");
        }
        
    }
    
}
