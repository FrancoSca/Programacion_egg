/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int num3 =0;
        System.out.println("Ingrese un numero para adivinar el producto de 2 numeros secretos: ");
        System.out.println(num1*num2);
        do {
            num3 = leer.nextInt();
            if (num3 != num1-num2) {
                System.out.println("Numero incorrecto !!");
                System.out.println("ingrese otro numero: ");
            } else {
                break;
            }
        } while (num3 != num1*num2);
        System.out.println("Felicitaciones !! El producto de los numeros secretos es: " + num3);
    }
    
}
