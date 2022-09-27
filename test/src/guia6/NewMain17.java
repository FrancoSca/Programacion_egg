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
public class NewMain17 {

    /**
     * @param args the command line arguments
     *
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int n = 0;

        int undigito = 0;
        int dosdigito = 0;
        int tresdigito = 0;
        int cuatrodigito = 0;
        int cincodigito = 0;

        do {
            System.out.println("ingrese un valor numerico positivo no mayor a 99999");
            n = leer.nextInt();
        } while (n > 99999);

        int[] vector = new int[n];

        //limpiar pantalla
       // System.out.print("\033[H\033[2J");
        //System.out.flush();
        //ClearConsole();
        //limpiar pantalla

        for (int i = 0; i < n; i++) {
            vector[i] = i;
            if ((vector[i] <= 99999) && (vector[i] >= 10000)) {
                cincodigito++;
            } else if ((vector[i] < 10000) && (vector[i] >= 1000)) {
                cuatrodigito++;
            } else if ((vector[i] < 1000) && (vector[i] >= 100)) {
                tresdigito++;
            } else if ((vector[i] < 100) && (vector[i] >= 10)) {
                dosdigito++;
            } else {
                undigito++;
            }

        }

        if (n>=10000) {
            undigito=undigito-1;
            cincodigito=cincodigito+1;
            
        }
        
        System.out.println("el numero seleccionado fue " + n);
        System.out.println(n + " tiene la cantidad de " + undigito + " de numeros de un digito");
        System.out.println(n + " tiene la cantidad de " + dosdigito + " de numeros de dos digito");
        System.out.println(n + " tiene la cantidad de " + tresdigito + " de numeros de tres digito");
        System.out.println(n + " tiene la cantidad de " + cuatrodigito + " de numeros de cuatro digito");
        System.out.println(n + " tiene la cantidad de " + cincodigito + " de numeros de cinco digito");
        
         }
    /*     public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name");
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO.start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO.start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }*/
   

}
