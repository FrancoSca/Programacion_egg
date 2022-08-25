/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.


 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra7While {

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
        while (n>cont) {
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
            
        }
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minino es: " + min);
        System.out.println("El promedio de los numeros ingresados es: " + (double)tot/n);
    }
    
}
