/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        int bien =0;
        int mal=0;
        do { 
            System.out.println("Ingrese la cadena: ");
            cadena=leer.nextLine();
            if (cadena.length() !=5 && !cadena.substring(0).equals("x")  && !cadena.substring(cadena.length()-1).equals("o")) {
                mal= mal+1;
            } else{
                bien=bien+1;
            }
            
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas es: " +bien);
        System.out.println("La cantidad de cadenas incorrectas es: " +(mal-1));
    }
    
}
