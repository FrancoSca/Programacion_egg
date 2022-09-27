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
public class NewClass4 {
    
    /**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args
 */


   
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
        int c;
        double f;
          System.out.println("Ingrese la Temp en °C");
            c = leer.nextInt();
            f =  32 + (9*c/5);
            System.out.println("La Temp en °F es: "+f);
    
    
}

}
