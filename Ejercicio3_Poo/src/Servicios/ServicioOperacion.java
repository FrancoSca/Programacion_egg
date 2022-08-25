package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServicioOperacion {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion (Operacion op) {
        System.out.println("Ingrese 2 numeros para realizar operaciones: ");
        op.setNumero1(leer.nextInt());
        op.setNumero2(leer.nextInt());
        return op;
    }
    
    public int sumar(Operacion op){
        return (op.getNumero1() + op.getNumero2());
    }
    
    public int restar(Operacion op){
        return (op.getNumero1() - op.getNumero2());
    }
    
    public void multiplicar(Operacion op){
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
              System.out.println("No es posible multiplicar po 0, operando invalido.");
        } else {
              System.out.println("El resultado de la multiplicacion es: " + op.getNumero1()*op.getNumero2() );
        }
    } 
    public void dividir(Operacion op){
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
              System.out.println("No es posible Dividir po 0, operando invalido.");
        } else {
              System.out.println("El resultado de la division es: " + (float) (op.getNumero1()/op.getNumero2()) );
        }
    }
}
