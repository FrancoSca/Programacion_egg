
package ejercicio6_poo;

import Entidades.Cafetera;
import Servicios.ServCafetera;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio6_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServCafetera serv = new ServCafetera();
        Cafetera cafe = serv.crearCafetera();
        int elec= 0;
        do {            
        System.out.println("MENU");
        System.out.println("1- Llenar cafetera.");
        System.out.println("2- Servir Taza.");
        System.out.println("3- Vaciar Cafetera.");
        System.out.println("4- Agregar café.");
        System.out.println("5- Salir.");
        elec = leer.nextInt();
        switch (elec){
            case 1:
                serv.llenarCafetera(cafe);
                break;
            case 2:
                serv.servirTaza(cafe);
                break;
            case 3:
                serv.vaciarCafetera(cafe);
                break;
            case 4:
                serv.agregarCafe(cafe);
                break;
            case 5:
                System.out.println("Saliendo del sistema...");
        }
        } while (elec !=5);
    }
    
}
