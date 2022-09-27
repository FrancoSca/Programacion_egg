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
public class NewMain2extra {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 4 valores diferentes para cada variable");
        int A = leer.nextInt();
        int B = leer.nextInt();
        int C = leer.nextInt();
        int D = leer.nextInt();
        System.out.println("para A el valor es "+A);
        System.out.println("para Bel valor es "+B);
        System.out.println("para C el valor es "+C);
        System.out.println("para D el valor es "+D);
        int auxiliar = 0;
        auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;
        System.out.println("para A el nuevo valor es "+A);
        System.out.println("para B el nuevo valor es "+B);
        System.out.println("para C el nuevo valor es "+C);
        System.out.println("para D el nuevo valor es "+D);
    }
    
}
