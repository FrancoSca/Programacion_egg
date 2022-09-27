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
public class NewClass9 {
  /**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
     * @param args
 */


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena,sc, comp ;
    System.out.println("Ingrese una frase");
    cadena=leer.nextLine();
    sc = cadena.substring(0, 1);
    comp = "A";
    if (sc.equalsIgnoreCase(comp)){
        System.out.println("CORRECTO");
    }    
    else{
        System.out.println("INCORRECTO");
    }
    }
    

}
