/*
 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Entidades;

/**
 *
 * @author FrancoSca
 */
public class Perro {

    private String Raza;
    private String nombre; 

    public Perro(String Raza, String nombre) {
        this.Raza = Raza;
        this.nombre = nombre;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return nombre.substring(0, 1).toUpperCase() + " Raza =" + Raza + '}';
    }

}
