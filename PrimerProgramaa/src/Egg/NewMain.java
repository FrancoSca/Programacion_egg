/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

 public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    int nota;
    System.out.println("Ingrese la nota del alumno");
        nota = leer.nextInt();
    while (nota > 10 || nota < 0 ) {
        System.out.println("La nota ingresada es incorrecta.");
        System.out.println("Ingrese la nota del alumno");
        nota = leer.nextInt();
    }
     System.out.println("La nota del alumno es " +nota);
             
    }
}
15