/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author FrancoSca
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Perro mascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "La persona " + nombre + " tiene por mascota a: " + mascota.toString();
    }

    
    
}
