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
public class NewMain14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €

        */
   Scanner leerInt = new Scanner(System.in);
   Scanner leerString = new Scanner(System.in);
   
   System.out.println("Ingrese la cantidad de euros que desea cambiar:");
   int euros = leerInt.nextInt();
        String moneda;
        do{
        System.out.println("Ingrese la moneda de cambio (dolares, yenes o libras):");
         moneda = leerString.nextLine();
  }while(!moneda.equalsIgnoreCase("dolares")&&!moneda.equalsIgnoreCase("yenes")&&!moneda.equalsIgnoreCase("libra"));
   
        convertidor(euros, moneda);
        
    }
    public static void convertidor (int euros, String moneda){
        double conversor = 0;
        double dolares = 1.28611;
        double yenes = 129.852;
        double libra = 0.86;
        switch (moneda){
            case "dolares": 
                conversor = dolares * euros;
                System.out.println(conversor);   
                break; 
            case "yenes":
                conversor = yenes * euros;
                System.out.println(conversor);   
                break;
            case "libra":
                conversor = libra * euros;
                System.out.println(conversor);   
                break;
        }
            
        
     
       
   }
 
}
