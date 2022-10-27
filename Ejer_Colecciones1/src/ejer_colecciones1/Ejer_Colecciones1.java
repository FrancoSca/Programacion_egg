/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejer_colecciones1;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;
import servicios.SerpAdoptar;

/**
 *
 * @author FrancoSca
 */
public class Ejer_Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SerpAdoptar serv = new SerpAdoptar();
        Persona p1 = serv.crearPersona();
        Persona p2 = serv.crearPersona();
        Perro perr1 = serv.cargarPerro();
        Perro perr2 = serv.cargarPerro();
        
        System.out.println("Ingrese la persona a la que desea asignar un perro: ");
        int elec = leer.nextInt();
        if (elec == 1) {
            System.out.println("Elija el perro que desea asignar a la persona " + p1.getNombre());
            elec = leer.nextInt();
            if (elec == 1) {
                p1.setMascota(perr1);
                System.out.println(p1.toString());
            } else {
                p1.setMascota(perr2);
                System.out.println(p1.toString());
            }
        } else {
            System.out.println("Elija el perro que desea asignar a la persona " + p2.getNombre());
            elec = leer.nextInt();
            if (elec == 1) {
                p2.setMascota(perr1);
                System.out.println(p2.toString());
            } else {
                p1.setMascota(perr2);
                System.out.println(p2.toString());
            }
        }
    }
    
}
