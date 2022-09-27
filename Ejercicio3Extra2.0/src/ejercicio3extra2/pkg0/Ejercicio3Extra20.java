/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra2.pkg0;

import entities.Pass;
import services.PassService;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio3Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PassService ps = new PassService();
        Pass usuario1 = ps.crearUsuario("pepe1", 12314);
        
        ps.menu(usuario1);
    }
    
}
