/*
 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10_poo;

import java.util.Arrays;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio10_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short [] vectorA = new short [50];
        short [] vectorB = new short [20];
        for (int i = 0; i < 50; i++) {
            vectorA[i] = (short) (Math.random()*10);
            System.out.print("[" + vectorA[i] + "]");
            System.out.print(" ");
        }
        for (int i = 0; i < 20; i++) {
            vectorB[i] = (short) (Math.random()*10);
        }
        System.out.println(" ");
        Arrays.sort(vectorA);
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        
        System.out.println(Arrays.toString(vectorA));

        System.out.println("");
        
        System.out.println(Arrays.toString(vectorB));
        
        System.out.println("");
    }
    
}
