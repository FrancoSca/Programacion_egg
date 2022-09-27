/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Pass;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class PassService {

    Scanner leer;

    public PassService() {

        leer = new Scanner(System.in).useDelimiter("\n");

    }

    public Pass crearUsuario(String nombre, int dni) {

        Pass usuario = new Pass(nombre, dni);

        return usuario;

    }


    public void crearPass(Pass UsuarioEj) {

        String contrasena;

        System.out.println("Cree una nueva contraseña: (La contraseña debe tener 10 digitos de longitud). ");

        do {

            contrasena = leer.next();
            
            if ( contrasena.length() != 10 ){
                
                System.out.println("Contraseña incorrecta, intentelo nuevamente.");
                
            }

        } while (contrasena.length() != 10);

        UsuarioEj.setPass(contrasena);

    }
    
  
    public void analizarPass ( Pass usuarioEj ){
        
        int contador1 = 0;
        int contador2 = 0;
        
        for (int i = 0; i < usuarioEj.getPass().length(); i++) {
            
            if ( (usuarioEj.getPass().substring( i , i + 1 )).equalsIgnoreCase("z") ){
                
                contador1++;
                
            } else if (  (usuarioEj.getPass().substring( i , i + 1 )).equalsIgnoreCase("a") ){
                
                contador2++;
                
            }
            
        }
        
        if ( contador1 == 0 && contador2 == 0 ){
            
            System.out.println("Su contraseña tiene una seguridad BAJA.");
            
        } else if ( contador1 > 0 && contador2 < 2  ){
            
             System.out.println("Su contraseña tiene una seguridad MEDIA.");
            
        } else if ( contador1 > 0 && contador2 >= 2  ){
            
             System.out.println("Su contraseña tiene una seguridad ALTA.");
            
        }
        
    }
    
    public void cambiarDatos (Pass usuarioEj){
        System.out.println("Ingrese 1 para modificar nombre o 2 para modificar DNI:");
        int elec = leer.nextInt();
        System.out.println("Ingrese su contraseña actual.");
        if (usuarioEj.getPass().equals(leer.next())) {            
            switch (elec){
            case 1 :
                System.out.println("Ingrese el nuevo nombre: ");
                usuarioEj.setNombre(leer.next());
                break;
            case 2 :
                System.out.println("Ingrese el nuevo DNI: ");
                usuarioEj.setDni(leer.nextInt());
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
      } else {
            System.out.println("Clave incorrecta.");
        }
    
            
        }
    public void cambiarPass (Pass usuarioEj){
        System.out.println("Ingrese contraseña actual");
        if (usuarioEj.getPass().equals(leer.next())) { 
            crearPass(usuarioEj);
        } else {
            System.out.println("La clave ingresada no es correcta.");
        }
    }
    
    public void menu (Pass usuarioEj){
        boolean cond = true;
        if (usuarioEj.getPass() == null) {
            crearPass(usuarioEj);
        }
        while (cond){
        System.out.println("A) Nivel de contraseña.");
        System.out.println("B) Modificar contraseña.");
        System.out.println("C) Modificar datos.");
        System.out.println("D) Mostrar datos.");
        System.out.println("X) Salir.");
        String opc = leer.next();
        switch (opc.toLowerCase()){
            case "a":
                analizarPass(usuarioEj);
                break;
            case "b":
                cambiarPass(usuarioEj);
                break;
            case "c":
                cambiarDatos(usuarioEj);
                break;
            case "d":
                System.out.println(usuarioEj.toString());
                break;
            case "x":
                System.out.println("Fin del sistema.");
                cond = false;
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
    }
    }
}
