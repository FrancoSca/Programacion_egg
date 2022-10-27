/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio1y2_colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio1y2_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String elec = null;
        boolean band = true;
        while (band) {            
            System.out.println("Ingrese una raza de perro: ");
            String raza = leer.next();
            razas.add(raza);
            
            while (band){                
                System.out.println("Desea ingresar otra raza ? (S/N)");
            elec = leer.next();
            if (elec.equalsIgnoreCase("N")) {
                band = false;
               break;
            } else if (elec.equalsIgnoreCase("S")) {
                break;
            } else {
                System.out.println("Opcion incorrecta.");
            }
            }
            if (elec.equalsIgnoreCase("n")) {
                break;
            }
            
        }
        System.out.println("Las razas ingresadas son: ");
        System.out.println(razas.toString());
        System.out.println("Ingrese la raza a eliminar de la lista: ");
        String elim = leer.next();
        int cant = razas.size();
        int cont =0;
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(elim)) {
                it.remove();
            } else {
                cont ++;
            }
        }
        if (cont != cant) {
            System.out.println("La lista quedo de la siguiente manera: ");
            System.out.println(razas.toString());
        } else {
            System.out.println("La raza ingresada no se encontro en la lista.");
        }
 
    }
    
}
