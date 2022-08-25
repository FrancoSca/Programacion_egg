/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int n = 1;
        int total = 0;
        System.out.println("Ingrese numeros enteros: ");
        while (n>0) {     
            n = leer.nextInt();
            if (n%2 == 0) {
                par ++;
                total ++;
            } else if (n%5 == 0) {
                break;
            }  
            else {
                impar ++;
                total ++;
            }
        }
        System.out.println("La cantidad de numeros ingresados es: " + total);
        System.out.println("La cantidad de numeros impares es: " + impar);
        System.out.println("La cantidad de numeros pares es: " + par);
    }
    
}
