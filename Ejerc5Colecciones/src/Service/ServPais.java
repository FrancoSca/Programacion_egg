/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Service;

import Entities.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class ServPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> Paises = new HashSet<>();
    Pais pais;

    public Pais crearPais() {
        pais = new Pais();
        System.out.println("Ingrese el nombre del pais que quiere agregar: ");
        pais.setNombre(leer.next().toLowerCase());
        return pais;
    }

    public void llenarPaises() {
        Paises.add(pais);
        while (true) {
            System.out.println("Desea ingresar otro pais ? (S/N)");
            String elec = leer.next();
            if (elec.equalsIgnoreCase("s")) {
                crearPais();
                Paises.add(pais);
            } else if (elec.equalsIgnoreCase("n")){
                break;
            } else {
                System.out.println("Opcion incorrecta.");
            }
                
        }

    }
    
    public void mostrarPaises(){
        
        TreeSet <String> listaPaises = new TreeSet();
        Paises.forEach((Paiss) -> {
            listaPaises.add(Paiss.getNombre());
        });
        
        System.out.println(listaPaises.toString());
        
    }
    
    public void eliminarPais(){
        Iterator <Pais> it = Paises.iterator();
        boolean band = false;
        System.out.println("Ingrese el nombre del pais que desea eliminar: ");
        String paisEliminar = leer.next().toLowerCase();
        while (it.hasNext()) {            
            if (it.next().getNombre().equalsIgnoreCase(paisEliminar)) {
                it.remove();
                band = true;
            }
        }
        if (band) {
            System.out.print("El pais " + paisEliminar + " fue eliminado, los paises que quedan son: ");
            mostrarPaises();
        } else {
            System.out.println("El pais no fue eliminado porque no se encontraba en la lista.");
        }
 
    }
    
}
