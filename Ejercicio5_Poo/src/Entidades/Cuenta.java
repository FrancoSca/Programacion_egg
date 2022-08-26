package Entidades;

/**
 *
 * @author FrancoSca
 */
public class Cuenta {
    
    private int numeroCuenta;
    private int dni;
    private double saldo;
    private String nombreUs;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldo, String nombreUs) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.nombreUs = nombreUs;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    
    
}
