/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class SerpAdoptar {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona (){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre del usuario: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo: ");
        p1.setSexo(leer.next());
             return p1;
    }
    public Perro cargarPerro (){
        Perro perr1 = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        perr1.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        perr1.setEdad(leer.nextInt());
        System.out.println("Ingrese su raza: ");
        perr1.setRaza(leer.next());
        System.out.println("Ingrese su sexo: ");
        perr1.setSexo(leer.next());
        return perr1;
    }
    
}
