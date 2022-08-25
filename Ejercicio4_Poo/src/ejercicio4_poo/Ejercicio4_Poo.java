package ejercicio4_poo;

import Entidades.Rectangulo;
import Servicios.ServRectangulo;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio4_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        ServRectangulo serv = new ServRectangulo();
        serv.crearRect(rec);
        serv.mostrarRectangulo(rec);
        System.out.println("La superficie del rectangulo es: " + serv.superficie(rec));
        System.out.println("El perimetro del rectangulo es: " + serv.perimetro(rec));
    }
    
}
