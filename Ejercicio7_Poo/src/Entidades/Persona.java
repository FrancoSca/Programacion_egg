
package Entidades;

/**
 *
 * @author FrancoSca
 */
public class Persona {
    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    private char sexo;
    private double imc;
    private int resImc;
    private boolean esMayor;

    public boolean getEsMayor() {
        return esMayor;
    }

    public void setEsMayor(boolean esMayor) {
        this.esMayor = esMayor;
    }

    public int getResImc() {
        return resImc;
    }

    public void setResImc(int resImc) {
        this.resImc = resImc;
    }
    public Persona() {
    }

    public Persona(String nombre, int edad, int altura, double peso, char sexo, int imc) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.imc = imc;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }


    
}
