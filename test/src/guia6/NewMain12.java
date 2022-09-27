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
public class NewMain12 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        /*
        12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().
        */
        Scanner leer = new Scanner(System.in);
        
         String cadena;
        int correctas = 0;
        int total = 0;
        
        
        do {
        
           
       System.out.println("Ingrese cadenas");
       cadena = leer.nextLine();
       cadena = cadena.toUpperCase();
       total = total +1;
       
       if(cadena.length() <= 5 && ("X".equals(cadena.substring(0,1)) || "O".equals(cadena.substring(0,cadena.length())))){
           correctas = correctas + 1;
       }
        }
        while( !"&&&&&".equals(cadena));
        int incorrectas = total - correctas;
        System.out.println("El numero de lecturas correctas ingresadas es/son: " + correctas);   
        System.out.println("El numero de lecturas incorrectas ingresadas es/ son: " + (incorrectas-1));
    }
    
    
}
