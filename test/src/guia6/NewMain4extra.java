/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Samu Noah
 */
public class NewMain4extra {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10");
        int numer = leer.nextInt();
        switch(numer){
            case 1:
                System.out.println("el numero ingresado equivale a I");
                break;
            case 2:
                System.out.println("el numero ingresado equivale a II");
                break;
            case 3:
                System.out.println("el numero ingresado equivale a III");
                break;
            case 4:
                System.out.println("el numero ingresado equivale a IV");
                break;
            case 5:
                System.out.println("el numero ingresado equivale a V");
                break;
            case 6:
                System.out.println("el numero ingresado equivale a VI");
                break;
            case 7:
                System.out.println("el numero ingresado equivale a VII");
                break;
            case 8:
                System.out.println("el numero ingresado equivale a VIII");
                break;
            case 9:
                System.out.println("el numero ingresado equivale a IX");
                break;
            case 10:
                System.out.println("el numero ingresado equivale a X");
                break;
            default:
                System.out.println("No ingreso un numero del 1 al 10");
                
        }
                
        
        
    }
    
}
