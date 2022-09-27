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
public class NewMain1extra {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.                  
     *
     * @param arg
     */
    public static void main(String[]arg) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        int dias=(int) minutos / 1440;
        minutos= minutos - (dias*1440);
        int horas =(int) minutos / 60;
        System.out.println("su equivalente en dias es "+dias+" y horas "+horas);
    }
    
}
       