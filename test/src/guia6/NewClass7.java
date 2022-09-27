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
public class NewClass7 {
    
    /**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     * @param args
 */


 
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena, m;
    System.out.println("Ingrese una frase");
    cadena=leer.nextLine();
    m="eureka";
    if (cadena.equals(m)){
        System.out.println("CORRECTO");
    }
    else{
        System.out.println("INCORRECTO");
    }
    }

}
