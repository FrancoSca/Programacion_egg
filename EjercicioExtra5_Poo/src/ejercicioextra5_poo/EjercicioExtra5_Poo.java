/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ejercicioextra5_poo;

import Entidades.Mes;
import Servicios.ServMes;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class EjercicioExtra5_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Mes mes = new Mes();
        ServMes serv = new ServMes();
         do { 
        mes = serv.crearMes(mes);
        boolean verif;
                  
            verif = serv.buscarMes(mes);
                if (verif == true) {
                    System.out.println("Felicitaciones, adivino el mes secreto !");
                    System.out.println("Desea volver a jugar ?? (S/N)");
                    String elec = leer.next();
                    if (elec.equalsIgnoreCase("s")) {
                        verif = false;
                    } else {
                        System.out.println("Gracias por jugar !!");
                        break;
                    }
            } else {
                    System.out.println("Intente de nuevo !");
                }
            
        } while (true);

    }
    
}
