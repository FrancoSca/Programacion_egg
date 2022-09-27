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
public class NewMain2111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][] = new int[10][10]; 
        int submatriz[][] = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Matriz Incluida");
        System.out.println(" ");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese valores de la fila "+(i+1)+"°");
            for (int j = 0; j < 3; j++) {
                submatriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("[" + submatriz[i][j] + "]");
        }
            System.out.println(" ");
        }
//        int contador=0;
//        int cordenada1,cordenada2;
          boolean esta=false;
          int colu = 0;
          int fila = 0;
                    
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    
                    if (matriz[i][j] == submatriz [0][0] ) {
                        System.out.println("encontre 1° elemento 1°fila " +i+" "+j);
                        
                        if(matriz[i][j+1]== submatriz [0][1] ){
                            System.out.println("encontre 2° elemento 1° fila " +i+" "+(j+1));
                            }
                        if(matriz[i][j+2]== submatriz [0][2] ){
                            System.out.println("encontre 3° elemento 1° fila  " +i+" "+(j+2));
                            }      
                        if (matriz[i+1][j] == submatriz [1][0] ) {
                        System.out.println("encontre 1° elemento 2° fila  " +(i+1)+" "+j);
                        
                        if(matriz[i+1][j+1]== submatriz [1][1] ){
                            System.out.println("encontre 2° elemento 2° fila  " +(i+1)+" "+(j+1));
                            }
                        if(matriz[i+1][j+2]== submatriz [1][2] ){
                            System.out.println("encontre 3° elemento 2° fila  " +(i+1)+" "+(j+2));
                            }
                        }
                        if (matriz[i+2][j] == submatriz [2][0] ) {
                            System.out.println("encontre 1° elemento 3° fila  " +(i+2)+" "+j);
                        
                        if(matriz[i+2][j+1]== submatriz [2][1] ){
                            System.out.println("encontre 2° elemento 3° fila  " +(i+2)+" "+(j+1));
                            }
                        if(matriz[i+2][j+2]== submatriz [2][2] ){
                            System.out.println("encontre 3° elemento 3° fila  " +(i+2)+" "+(j+2));
                            esta=true;
                            fila = i;
                            colu = j;
                                                    }

                        }
                    }
                }
                if (esta==true){
                    System.out.println("Está incluida....") ;
                    System.out.println("la submatriz empieza en las coordenadas "+fila+" "+colu) ;
                    break;
                }
            }
            if (esta==false){
                    System.out.println("No está incluida....");
                }
       
    }
    
}
