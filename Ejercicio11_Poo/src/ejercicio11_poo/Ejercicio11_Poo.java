/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio11_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Date fechaActual = new Date();
        int dia, mes, anio;
        
        System.out.println("Ingrese el día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        
        // Parámetros: Año - 1900; mes - 1 y dia. 
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        
        System.out.println("Fecha ingresada: " + fechaIngresada.toString());
        System.out.println("Fecha actual: " + fechaActual.toString());
        
        System.out.println("La diferencia de años es: " + (fechaActual.getYear() - fechaIngresada.getYear()) + " años.");
        
    }

}
