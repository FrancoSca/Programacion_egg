/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author Samu Noah
 */

    
    /*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
import java.util.Scanner;


public class NewMain {

 
    public static void main(String[] args) {
     System.out.println("Ingresa tu nombre");   
    Scanner leer  = new Scanner(System.in);
    String cadena = leer.nextLine();
        System.out.println("mi nombre es "+cadena);
        
    }
    
}


