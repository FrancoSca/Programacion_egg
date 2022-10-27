/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1relaciones;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author German
 */
public class Ej1Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Carrosco", "Border Collie", 3, 0.6);
        Perro perro2 = new Perro("Tobi", "Pitbull", 5, 0.9);
        
        Persona persona1 = new Persona("Horacio", "Toranzo", 43, 26543234, perro1);
        Persona persona2 = new Persona("Laura", "Messera", 39, 31298056, perro2);
        
        System.out.println("Persona 1:");
        System.out.println(persona1.toString());
        System.out.println("----------------------");
        System.out.println("Persona 2:");
        System.out.println(persona2.toString());
    }
    
}
