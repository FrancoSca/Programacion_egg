
package servicio;

import entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
    Scanner leer;
   public Persona crearCliente(){
        Persona c1 = new Persona();
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        c1.setNombre(leer.next());
        System.out.println("Ingrese el dinero que posee: ");
        c1.setDineroDisponible(leer.nextDouble());
        System.out.println("Ingrese su edad: ");
        c1.setEdad(leer.nextInt());
        return c1;
    }

   
}
