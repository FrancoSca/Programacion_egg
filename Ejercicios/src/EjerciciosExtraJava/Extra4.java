/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano..

 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10: ");
        int num = leer.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    System.out.print("I");
                }
                System.out.println("");
                 break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
            case 7:
            case 8:
                   System.out.print("V");
                  for (int i = 5; i < num; i++) {
                    System.out.print("I");
                  }
                  System.out.println("");
                   break; 
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
        }
    }
    
}
