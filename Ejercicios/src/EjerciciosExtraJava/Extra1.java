/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int min = leer.nextInt();
        calculo(min);
    }
    public static void calculo(int min){

        int horas;
        int dias;
        horas = min/60;
        dias = horas/24;
        horas = horas%24;
        System.out.println("Su equivalente es: " + dias + " día, " + horas + " horas." );
       
    }
}
