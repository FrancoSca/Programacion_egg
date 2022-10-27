/*
  1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLista() {

        ArrayList<Perro> chocos = new ArrayList<>();
        String elec = "";
        do {
            Perro choco = new Perro();
            System.out.println("Ingrese el nombre del perro: ");
            choco.setNombre(leer.next().toLowerCase());
            System.out.println("Ingrese la raza del perro: ");
            choco.setRaza(leer.next().toLowerCase());
            chocos.add(choco);
            System.out.println("Desea ingresar otra raza ?(S/N) ");
            elec = leer.next();

        } while (!elec.equalsIgnoreCase("N"));
        System.out.println(chocos.toString());

    }

}
