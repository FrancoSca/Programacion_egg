/*
 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una letra: ");
       String letra = leer.nextLine();
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
            System.out.println("La letra es una vocal.");
            
        } else {
            System.out.println("La letra no es una vocal.");
        }
    }
    
}
