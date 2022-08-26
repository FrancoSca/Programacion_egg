package ejercicio5_poo;

import Entidades.Cuenta;
import Servicios.ServCuenta;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio5_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuent = new Cuenta();
        ServCuenta serv = new ServCuenta();
        cuent = serv.creacCuenta(cuent);
        int elec = 0;
        do {   
            
          System.out.println("Menu:");
          System.out.println("1- CONSULTAR SALDO");
          System.out.println("2- EXTRACCION");
          System.out.println("3- EXTRACCION RAPIDA");
          System.out.println("4- CONSULTAR DATOS");
          System.out.println("5- INGRESAR DINERO");
          System.out.println("6-FINALIZAR");
          elec = leer.nextInt();
          switch (elec){
              case 1:
                  serv.consultarSaldo(cuent);
                  System.out.println("¿Desea realizar otra operacion?");
                  System.out.println("1- SI.");
                  System.out.println("2- NO.");
                  elec = leer.nextInt();
                  if (elec ==2) {
                      elec = 6;
                  }
                  break;
              case 2:
                  serv.retirar(cuent);
                  System.out.println("¿Desea realizar otra operacion?");
                  System.out.println("1- SI.");
                  System.out.println("2- NO.");
                  elec = leer.nextInt();
                  if (elec ==2) {
                      elec = 6;
                  }
                  break;
              case 3:
                  serv.extraccionRapida(cuent);
                  System.out.println("¿Desea realizar otra operacion?");
                  System.out.println("1- SI.");
                  System.out.println("2- NO.");
                  elec = leer.nextInt();
                  if (elec ==2) {
                      elec = 6;
                  }
                  break;
              case 4:
                  serv.consultarDatos(cuent);
                  System.out.println("¿Desea realizar otra operacion?");
                  System.out.println("1- SI.");
                  System.out.println("2- NO.");
                  elec = leer.nextInt();
                  if (elec ==2) {
                      elec = 6;
                  }
                  break;
              case 5:
                  serv.ingresar(cuent);
                  System.out.println("¿Desea realizar otra operacion?");
                  System.out.println("1- SI.");
                  System.out.println("2- NO.");
                  elec = leer.nextInt();
                  if (elec ==2) {
                      elec = 6;
                  }
                  break;
              case 6:
                  System.out.println("Sistema finalizado.");
                  break;
              default:
                  System.out.println("La opcion ingresada es incorrecta.");
          }
        } while (elec !=6);
        
        
    }
    
}
