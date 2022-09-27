/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author Samu Noah
 */
public class NewMain15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
    */        

	int vector[] = new int[100]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 100; i++) {
         
            vector[i] = i+1; // Le asignamos los valores correspondientes
            
        }
        
        for (int i = 0; i < 100; i++) {
            
            System.out.print("[" + vector[i] + "]");
            
        }
        System.out.println(" ");
        for (int i = 99; i >=0; i--) {
            
            System.out.print("[" + vector[i] + "]");
            
        }
        System.out.println(" ");
    
    }
    
}
