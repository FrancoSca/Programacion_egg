/*
 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        int cent = leer.nextInt();
        int faren = 32 + (9 * cent / 5);
        System.out.println("La temperatura en grados farenheit es: " +faren);
    }
    
}
