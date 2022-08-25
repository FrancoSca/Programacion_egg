/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero limite: ");
        int limite = leer.nextInt();
        int suma = 0;
        while (suma<limite){
            System.out.println("Escriba un numero a sumar: ");
            int num = leer.nextInt();
            suma += num;
        }
        System.out.println("Ha superado el limite establecido.");
    }
    
}
