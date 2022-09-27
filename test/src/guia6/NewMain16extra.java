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
public class NewMain16extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        String resp;
        int edad;
        do{
            System.out.println("Ingrese su nombre");
            nombre = leer.next();
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
            if (edad >= 18){
                System.out.print("Su nombre es: " + nombre +
                        "\nSu edad es " + edad + " y es mayor de edad");
            }else{
                System.out.print("Su nombre es: " + nombre +
                        "\nSu edad es: " + edad + " y es menor de edad");
            }
            System.out.println("");
            System.out.println("Desea Continuar si o no?");
            resp = leer.next();
        }while(!resp.equals("no"));

    }
    
}
