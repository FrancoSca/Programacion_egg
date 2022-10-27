/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Entities.Pelicula;
import Utilities.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Pelicula> pelis = new ArrayList<>();
    Pelicula pel;
    Comparador comp = new Comparador();
    public Pelicula crearPeli(){
        pel = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula: ");
        pel.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del director de la pelicula: ");
        pel.setDirec(leer.next());
        System.out.println("Ingrese la duracion de la pelicula: ");
        pel.setDuracion(leer.nextDouble());
        return pel;
    }
    public void llenarCartelera(){
        pelis.add(pel);
        String elec = null;
        System.out.println("Desea agregar otra pelicula ? (S/N)");
        do {            
            elec = leer.next();
            if (!elec.equalsIgnoreCase("s") && !elec.equalsIgnoreCase("n")) {
                System.out.println("La opcion ingresada es incorrecta.");
            } else if (elec.equalsIgnoreCase("n")) {
                break;
            } else {
                crearPeli();
                llenarCartelera();
            }
        } while (true);
    }
    /*
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
    public void menu(){
        int elec = 0;
        do {
        System.out.println("-------MENU-------");
        System.out.println("1) Mostrar en pantalla todas las películas.");
        System.out.println("2) Mostrar en pantalla todas las películas con una duración mayor a 1 hora.");
        System.out.println("3) Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en\npantalla.");
        System.out.println("4) Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en\npantalla.");
        System.out.println("5) Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.");
        System.out.println("6) Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.");
        System.out.println("7) Salir del menu.");
        elec = leer.nextInt();
        ordenarPelis(elec);
        } while (elec != 7);
        
    }
    
    public void ordenarPelis(int elec){
        switch (elec){
            case 1:
                for (Pelicula peli : pelis) {
                    System.out.print(peli.getTitulo() + "\n");
                }
                break;
            case 2:
                for (int i = 0; i < pelis.size(); i++) {
                    if (pel.getDuracion()>1) {
                        System.out.println(pel.getTitulo());
                    }
                }
                break;
            case 3:
                Collections.sort(pelis, Comparador.compararDuracion);
                break;
            case 4:
                 Collections.sort(pelis, Comparador.compararDuracion.reversed());
                break;
            case 5:
                Collections.sort(pelis, Comparador.compararTitulo);
                break;
            case 6:
                Collections.sort(pelis, Comparador.compararDirector);
                break;
            case 7:
                System.out.println("Sistema finalizado.");
                break;
                default:
                    System.out.println("Opcion incorrecta.");
        }
    }
}
