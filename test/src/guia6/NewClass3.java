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
public class NewClass3 {
    
    /**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     * @param args
 */


 
    public static void main(String[] args) {
    System.out.println("Ingresa una frase");   
    Scanner leer  = new Scanner(System.in);
    String cadena = leer.nextLine();
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
    }
    
}

