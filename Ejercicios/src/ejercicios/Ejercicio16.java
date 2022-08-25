/
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamanio;
        int rep=0;
        int noEsta=0;
        System.out.println("Defina el tamaño del vector: ");
        tamanio = leer.nextInt();
        int[]Vector = new int [tamanio]; 
        for (int i = 0; i < tamanio; i++) {
            Vector[i]=(int) (Math.random()*10);  
        }
        System.out.println("Ingrese un numero a buscar en el vector: ");
        int num = leer.nextInt();
        for (int i = 0; i < tamanio; i++) {
            if (Vector[i]== num) {
                System.out.println("El numero se encuentra en la posicion " + i + " del vector.");
                rep=rep+1;
                
            } else {
                noEsta=noEsta +1;
            }
           
        }
         if (noEsta==tamanio) {
                System.out.println("El numero no se encontro :(");
                
            }else{
                System.out.println("El numero se encontro " + rep + " veces !");
            }
    }
    
}
