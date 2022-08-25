/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int personas = leer.nextInt();
        double estatura;
        double totalEstatura =0;
        double menor = 0;
        int contadorMenor=0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la estatura de la persona " + (i+1));
            estatura = leer.nextDouble();
            if (estatura<1.60) {
                menor += estatura;
                totalEstatura +=estatura;
                contadorMenor++;
            } else {
                totalEstatura +=estatura;
            }
            
        }
        System.out.println("El promedio de altura de las personas debajo de 1.60 es de: " + (menor/contadorMenor));
        System.out.println("El promedio de altura en general es: " + (totalEstatura/personas));
    }
    
}
