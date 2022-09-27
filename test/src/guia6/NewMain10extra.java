/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Samu Noah
 */
public class NewMain10extra {

    /**
     * @param args the command line arguments
     *
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numerorandom1 = (int) (Math.random() * 11 + 0);
        int numerorandom2 = (int) (Math.random() * 11 + 0);
        int resultado = numerorandom1 * numerorandom2;
        System.out.println("ingrese un numero que crea que es el correcto entre una multiplicacion al azar entre numeros del 0 al 10");
        int usuario = 0;
        //     System.out.println(resultado+" comparar");
        //    System.out.println(numerorandom1+" comparar");
        //   System.out.println(numerorandom2+" comparar");
        boolean firma = false;
        do {
            usuario = leer.nextInt();
            if (resultado == usuario) {
                firma = true;
                System.out.println("su respuesta fue correcta,felicitaciones.");
            } else {
                System.out.println("respuesta ingresada incorrecta");
            }

        } while (firma != true);
    }

}
