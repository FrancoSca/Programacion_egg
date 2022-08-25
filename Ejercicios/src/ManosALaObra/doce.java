/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero y otro numero para averiguar si es multiplo o no del primero: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2) {
        if ((num1%num2)==0) {
            System.out.println("El numero " + num1 + " es multiplo de " +num2);
            
        } else{
            System.out.println("El numero " + num1 + " no es multiplo de " +num2); 
        }
        
    }
}
