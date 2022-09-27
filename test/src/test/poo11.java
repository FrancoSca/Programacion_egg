/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class poo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = 0, mes = 0, anio = 0;
        Date fecha = new Date(dia, mes, anio);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dia: ");
        fecha.setDate(leer.nextInt());
        System.out.println("Ingrese el mes: ");
        fecha.setMonth(leer.nextInt() - 1);
        System.out.println("Ingrese el anio: ");
        fecha.setYear(leer.nextInt() - 1900);
        System.out.println("" + fecha);
        Date fecha2 = new Date();
        System.out.println("" + fecha2);

        System.out.println("la diferencia es: " +  (fecha2.getYear() -fecha.getYear()  ));

        Period edad = Period.between(LocalDate.of(fecha.getYear(), fecha.getMonth(),
                fecha.getDate()), LocalDate.now());
        System.out.println(String.format("%d anios, %d meses y %d dias", edad.getYears() - 1900,
                edad.getMonths() - 1, edad.getDays()));
    }

}