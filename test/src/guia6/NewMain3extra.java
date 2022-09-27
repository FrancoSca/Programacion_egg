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
public class NewMain3extra {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una vocal");
        String vocal ="";
        do {            
            vocal = leer.next();
        } while (vocal.length()>1);
        if (vocal.equalsIgnoreCase("a")||vocal.equalsIgnoreCase("e")||vocal.equalsIgnoreCase("i")||vocal.equalsIgnoreCase("o")||vocal.equalsIgnoreCase("u"))  {
            System.out.println("la letra ingresada es una vocal");
        }else{
            System.out.println("la letra ingresada no es una vocal");
        }
        
    }
    
}
