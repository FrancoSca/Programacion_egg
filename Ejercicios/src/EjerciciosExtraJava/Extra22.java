/
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese 4 numeros: ");
        System.out.println("Numero A");
        int num1 = leer.nextInt();
         System.out.println("Numero B");
        int num2 = leer.nextInt();
         System.out.println("Numero C");
        int num3 = leer.nextInt();
         System.out.println("Numero D");
        int num4 = leer.nextInt();
        int aux = num2;
        num2 = num3;
        num3 = num1;
        num1 = num4;
        num4 = aux;
        System.out.println("Numero A cambiado: " + num1);
        System.out.println("Numero B cambiado: " + num2);
        System.out.println("Numero C cambiado: " + num3);
        System.out.println("Numero D cambiado: " + num4);
    }
    
}
