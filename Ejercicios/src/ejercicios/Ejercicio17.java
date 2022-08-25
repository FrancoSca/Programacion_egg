/
 * T17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        int unD = 0;
        int DosD = 0;
        int tresD = 0;
        int cuaD = 0;
        int cinD = 0;                                           
        System.out.println("Ingrese la dimension de su vector: ");
        dimension = leer.nextInt();
        int []vector= new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) (Math.random() * 10000);
            System.out.print(vector[i] + " ");
            if (vector[i]<10) {
                unD += 1;    
            } else if (vector[i]>=10 && vector[i]<99){
                DosD += 1;
            } else if (vector[i]>=100 && vector[i]<999){
                tresD += 1;
            } else if (vector[i]>=1000 && vector[i]<9999){
                cuaD += 1;
            } else if (vector[i]>=10000) {
                cinD += 1;
            }
        }
        System.out.println("En el vector hay " + unD + " numeros de 1 digito.");
        System.out.println("En el vector hay " + DosD + " numeros de 2 digitos.");
        System.out.println("En el vector hay " + tresD + " numeros de 3 digitos.");
        System.out.println("En el vector hay " + cuaD + " numeros de 4 digitos.");
        System.out.println("En el vector hay " + cinD + " numeros de 5 digitos.");
    }
    
}
