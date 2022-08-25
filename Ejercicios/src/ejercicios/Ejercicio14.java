/
 14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int elec = 0;
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        int euros = leer.nextInt();
        do {
            System.out.println("MENU: ");
            System.out.println("1- Cambiar a Libras");
            System.out.println("2- Cambiar a Dolares");
            System.out.println("3- Cambiar a Yenes");
            System.out.println("4- Cambiar monto");
            System.out.println("5- Salir");
            elec=leer.nextInt();
            switch (elec){
                case 1:
                    Cambio(euros,elec);
                    break;
                case 2:
                    Cambio(euros,elec);
                    break;
                case 3:
                    Cambio(euros,elec);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo monto: ");
                    euros=leer.nextInt();
                    break;
                case 5:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta.");
                    break;
            }
            
        } while (elec !=5);
            
            
        
    }
    public static void Cambio(int euros, int elec) {
        if (elec ==1) {
            double libras;
        libras = (euros*0.86);
        System.out.println("La cantidad de Libras correspondientes es: " + libras);
        }else if ( elec ==2) {
        double Dolares;
        Dolares = (euros*1.28611);
        System.out.println("La cantidad de Libras correspondientes es: " + Dolares);
            
        }else if (elec==3) {
                  double Yenes;
        Yenes = (euros*129.852);
        System.out.println("La cantidad de Libras correspondientes es: " + Yenes);
        }
        
    }
}
