/*
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package EjerciciosExtraJava;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio.");
        System.out.println("- Socio A");
        System.out.println("- Socio B");
        System.out.println("- Socio C");
        char op = leer.next().charAt(0);
        System.out.println("Ingrese el costo del tratamiento: ");
        int trat = leer.nextInt();
        switch (op) {
            case 'a':
            case 'A':
                System.out.println("El costo del tratamiento es: " + trat*0.5);
                break;
            case 'b':
            case 'B':
                System.out.println("El costo del tratamiento es: " + trat*0.65);
                break;
            case 'c':
            case 'C':
                System.out.println("El costo del tratamiento es: " + trat);
                break;
        }
    }
    
}
