.
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void creacCuenta(Cuenta cuent){
        System.out.println("Ingrese su nombre completo: ");
        cuent.setNombreUs(leer.next());
        System.out.println("Ingrese su DNI: ");
        cuent.setDni(leer.nextInt());
        cuent.setNumeroCuenta((int) (Math.random()*100000000));
        
    }
}
