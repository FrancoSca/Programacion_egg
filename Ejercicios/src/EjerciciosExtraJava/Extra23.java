/
23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String [][] matriz = new String[20][20];
        int cont =0;
        int f = 0;
        for (int k = 0; k < 19; k++) {
            for (int l = 0; l < 19; l++) {
                matriz[k][l] = "*";
            
                if (k == 0 && k == 19) {
                    System.out.print(matriz[k][l] + "   ");
                } else {
                    System.out.print(matriz[k][l]);
                }                        
            }
            System.out.println("");
            }
           System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres.");
        do { 
            int k = (int) (Math.random() * 16);
            int l = (int) (Math.random() * 16);
        
            System.out.println("Ingrese una palabra.");           
            palabra = leer.nextLine();
            if (palabra.length()<3 || palabra.length()>5) {
                System.out.println("La palabra ingresada es incorrecta.");
            } else {
                palabra = palabra.toLowerCase();
                cont++;
            }
            for (int i = k; i < 19 - (palabra.length() + k)  ; i++) {
                for (int j = l; j < 19 - (palabra.length() + l) ; j++) {
                matriz[i][j] = palabra.substring(f,f+1);
                f ++;
            }
            }
            
        } while (cont<5);
         for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (i == 0 && i == 19) {
                    System.out.print(matriz[i][j] + "   ");
                } else {
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println(" ");
        }
    }
    }
    
    
    

