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
public class NewMain7extra {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numero a promediar");
        int N = leer.nextInt();
        int contawhile = 0;
        int numwhile= 0;
        int sumawhile = 0;
        int miniwhile = 0;
        int maxwhile = 0;
        
        while (contawhile<N) {     
            System.out.println("ingrese numeros positivos enteros");
            numwhile = leer.nextInt();
            sumawhile+=numwhile;
           // if (numwhile>maxwhile) {
           //     maxwhile=numwhile;
            //    }
            maxwhile= Math.max(maxwhile,numwhile);
            if (contawhile==0) {
                miniwhile=numwhile;
                
            }
            miniwhile=Math.min(miniwhile, numwhile);
            contawhile++;
        }
        System.out.println("el valor maximo es "+maxwhile);
        System.out.println("el valor minimo es "+miniwhile);
        System.out.println("el valor promedio es "+(float)(sumawhile/N));
        
        contawhile = 0;
        numwhile = 0;
        sumawhile = 0;
        miniwhile = 0;
        maxwhile = 0;
        
        
        do {            
             System.out.println("ingrese numeros positivos enteros");
              numwhile = leer.nextInt();
              sumawhile+=numwhile;
               maxwhile= Math.max(maxwhile,numwhile);
            if (contawhile==0) {
                miniwhile=numwhile;
                
            }
            miniwhile=Math.min(miniwhile, numwhile);
            contawhile++;
             
        } while (contawhile<N);
   
         System.out.println("el valor maximo es "+maxwhile);
        System.out.println("el valor minimo es "+miniwhile);
        System.out.println("el valor promedio es "+(float)(sumawhile/N));
        
        
    }
}
