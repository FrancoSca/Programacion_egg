/*
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Trece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String [5];
        System.out.println("Ingrese los nombres de los participantes del equipo");
        for (int i = 0; i < 5; i++) {
            Equipo[i]= leer.nextLine();
        }
    }
    
}
