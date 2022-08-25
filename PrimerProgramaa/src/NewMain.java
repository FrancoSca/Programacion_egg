
import java.util.Scanner;
import java.util.stream.DoubleStream;
import oracle.jrockit.jfr.JFRStats;

/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

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
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String retorno = cambioFrase(frase);
        System.out.println(retorno);

    }

    public static String cambioFrase(String frase) {
        String fraseDos = "";
        char letra;
        char cambioletra;
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            switch (letra) {
                case 'a':
                    fraseDos=fraseDos.concat("@");
                    break;
                case 'e':
                    fraseDos=fraseDos.concat("#");
                    break;
                case 'i':
                    fraseDos=fraseDos.concat("$");;
                    break;
                case 'o':
                    fraseDos=fraseDos.concat("%");
                    break;
                case 'u':
                    fraseDos=fraseDos.concat("*");;
                    break;
                default:
                    fraseDos.charAt(i)=concat(letra);
            
            }
        }
        
        return fraseDos;
    
    }
}