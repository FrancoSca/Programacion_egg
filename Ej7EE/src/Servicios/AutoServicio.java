/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class AutoServicio {
Scanner leer= new Scanner(System.in).useDelimiter("∖n");

public Auto crearAuto(){
    
    Auto autoEj = new Auto();
    System.out.println("Ingrese el nombre del Titular");
    autoEj.setNombreDuenio(leer.next());
    System.out.println("Ingrese la fecha de Vto Carnet");
    System.out.println("Ingrese AAAA-MM-DD");
    Date fecha = new Date((leer.nextInt()-1900),(leer.nextInt()-1),leer.nextInt());
    autoEj.setFechaVenc(fecha);
    System.out.println("Ingrese color del vehiculo");
    autoEj.setColor(leer.next());
    System.out.println("Ingrese modelo del vehiculo");
    autoEj.setModelo(leer.next());
    return autoEj;
}
public void modificarTitular(Auto autoEj){
    System.out.println("Ingrese nuevo titular");
    autoEj.setNombreDuenio(leer.next());
    System.out.println("Ingrese la fecha de Vto Carnet");
    System.out.println("Ingrese AAAA-MM-DD");
    Date fecha = new Date((leer.nextInt()-1900),(leer.nextInt()-1),leer.nextInt());
    autoEj.setFechaVenc(fecha);
}
public void trayecto(Auto autoEj){
    System.out.println("Ingrese los KM recorridos");
    int kmRec = leer.nextInt();
    autoEj.setKm(autoEj.getKm()+ kmRec);
    autoEj.setKmService(autoEj.getKmService()- kmRec);
    
    service(autoEj);
}
public void service(Auto autoEj){
    if (autoEj.get >= 10000){
        System.out.println("Usted debe realizar el service");
     
    }
}
}
