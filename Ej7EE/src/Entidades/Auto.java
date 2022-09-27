/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Auto {
    String nombreDuenio;
    Date fechaVenc;
    String color;
    String modelo;
    int kmService;
    int km;

    public Auto() {
    }

    public Auto(String nombreDuenio, Date fechaVenc, String color, String modelo) {
        this.nombreDuenio = nombreDuenio;
        this.fechaVenc = fechaVenc;
        this.color = color;
        this.modelo = modelo;
        this.km = 7500;
        this.kmService=10000;
    }

    public int getKmService() {
        return kmService;
    }

    public void setKmService(int kmService) {
        this.kmService = kmService;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombreDuenio=" + nombreDuenio + ", fechaVenc=" + fechaVenc + ", color=" + color + ", modelo=" + modelo + ", km=" + km + '}';
    }
    
    
            
    
    
}
