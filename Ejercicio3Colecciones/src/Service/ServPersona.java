/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Service;

import Entities.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona alum;
    String elec = null;
    ArrayList<Persona> alumnos = new ArrayList<>();
    public Persona crearPersona() {
        alum = new Persona();
        ArrayList <Integer> notasAux = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno: ");
            alum.setNombre(leer.next());
            System.out.println("Ingrese las 3 notas del alumno: ");
            for (int i = 0; i < 3; i++) {
                int nota = leer.nextInt();
                notasAux.add(nota);
            }
            alum.setNotas(notasAux);
            return alum;
    }
    
    public void llenarLista (){
        
            alumnos.add(alum);
            System.out.println("Desea ingresar otro alumno ? S/N");
            do {
                elec = leer.next();
                if (elec.equalsIgnoreCase("s")) {
                    crearPersona();
                    llenarLista();
                    break;
                } else if (elec.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("La opcion ingresada es incorrecta.");
                }
            } while (true);
            if (elec.equalsIgnoreCase("n")) {
            }
            
    }
    public void mostrar (){
        System.out.println(" " + alumnos.toString()); 
    }

    public void notaFinal() {
        boolean bandera = true;
        do {
            Iterator<Persona> it = alumnos.iterator();
            Integer suma = 0;
            System.out.println("Ingrese el nombre del alumno a calcular el\npromedio final");
            String alum = leer.next();
            int cont = 0;
            for (Persona alumno : alumnos) {

                if (alumno.getNombre().equalsIgnoreCase(alum)) {
                    System.out.println("El promedio final del alumno " + alumno.getNombre() + " es: ");
                    System.out.println((alumno.getNotas().get(0) + alumno.getNotas().get(1) + alumno.getNotas().get(2)) /3 );
                } else {
                    cont ++;
                    if (cont == 3) {
                     System.out.println("El nombre ingresado no esta en la lista.");        
                    }
                }
            }
            System.out.println("Desea calcular otro alumno ? S/N");
            String elec = leer.next();
            do { 
                if (elec.equalsIgnoreCase("s") || elec.equalsIgnoreCase("n")) {
                    if (elec.equalsIgnoreCase("s")) {
                        bandera = true;
                    } else {
                        bandera = false;
                    }
                    break;
                } else{
                    System.out.println("La opcion ingresada es incorrecta.");
                } 
                
            } while (!elec.equalsIgnoreCase("n") || !elec.equalsIgnoreCase("s"));
        } while (bandera);

    }

}
