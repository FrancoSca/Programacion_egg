
package ejercicio3_poo;

import Entidades.Operacion;
import Servicios.ServicioOperacion;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio3_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Operacion op = new Operacion();
            ServicioOperacion serv = new ServicioOperacion();
            serv.crearOperacion(op);
            int suma =serv.sumar(op);
            int resta = serv.restar(op);
            System.out.println("El resultado de la suma es: " + suma);
            System.out.println("El resultado de la resta es: " + resta);
            serv.multiplicar(op);
            serv.dividir(op);
    }
    
}
