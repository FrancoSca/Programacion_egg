package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta creacCuenta(Cuenta cuent){
        System.out.println("Ingrese su nombre completo: ");
        cuent.setNombreUs(leer.next());
        System.out.println("Ingrese su DNI: ");
        cuent.setDni(leer.nextInt());
        cuent.setNumeroCuenta((int) (Math.random()*100000000));

        return cuent;

    }
    public void ingresar (Cuenta cuent){
        System.out.println("Ingrese el monto que desea ingresar a su cuenta: ");
        cuent.setSaldo(leer.nextDouble() + cuent.getSaldo());
    }
    public void retirar (Cuenta cuent){
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro> cuent.getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else{
            System.out.println("Su saldo actual es: " + (cuent.getSaldo()-retiro));
        }
        
            
        }
    public void extraccionRapida (Cuenta cuent){
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro >(cuent.getSaldo()*0.2)){
            System.out.println("El monto ingresado es incorrecto, solo puede retirar el 20%.");
    } else {
            System.out.println("El monto retirado es de: " + retiro);
            System.out.println("Su saldo actual es: " + (cuent.getSaldo()-retiro));
        }
    }
    public void consultarSaldo(Cuenta cuent){
        System.out.println("El saldo actual es de: " + cuent.getSaldo());
    }
    public void consultarDatos (Cuenta cuent){
        System.out.println("Titular de la cuenta: " + cuent.getNombreUs());
        System.out.println("DNI del titular: " + cuent.getDni());
        System.out.println("Numero de cuenta: " + cuent.getNumeroCuenta());
    }
}
