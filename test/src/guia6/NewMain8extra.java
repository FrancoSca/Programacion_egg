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
public class NewMain8extra {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int Num = 0;
        int cantnum = 0;
        int impnum = 0;
        int parnum = 0;
        boolean cinco = false;
        
        do {            
            System.out.println("ingrese un numero entero y positivo");
            Num = leer.nextInt();
            if (Num%5==0) {
                cinco = true;
                break;
            }
            if (Num%2==0) {
                parnum++;
            }else{
                impnum++;
            }
             cantnum++;
        } while (!cinco);
        
        System.out.println("la cantidad de numeros pares es "+parnum);
        System.out.println("la cantidad de numeros impares es "+impnum);
        System.out.println("la cantidad de numeros introducidos es "+(cantnum+1));
    }
    
}
