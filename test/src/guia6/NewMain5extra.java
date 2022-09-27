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
public class NewMain5extra {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
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
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer1 = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
        System.out.println("ingrese su categoria de socio (A,B,C)");
        char socio = leer1.next().charAt(0);
        
        System.out.println("ingrese el monto del tratamiento");
        int monto = leer2.nextInt();
        
        switch(socio){
            case 'A': 
            case 'a':
                System.out.println("Usted debera abonar "+(monto-(monto*0.5)));
                break;
            case 'B': 
            case 'b':
                System.out.println("Usted debera abonar "+(monto-(monto*0.35)));
                break;
            case 'C': 
            case 'c':
                System.out.println("Usted debera abonar "+monto);
                break;
            default:
                System.out.println("no ingreso una categoria de socio valido");
            
            
        
    }
        
        
        
        
        
    }
    
}
