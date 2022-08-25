/
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        for (int i = 100; i > 0; i--) {
            System.out.print(vector[i-1]);
            System.out.print(" ");
        }
    }
    
}
