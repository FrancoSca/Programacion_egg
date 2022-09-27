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
public class NewMain11extra {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt(), contador = 0;
        double para = num;
        while (para>1) {            
            para = (double) para / 10;
            System.out.println(para);
            contador ++;
        }
        System.out.println("el numero posee "+contador+" de digitos");
    }
    
}
