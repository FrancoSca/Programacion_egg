/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author FrancoSca
 */
public class ServMat {
    public Matematica creacCuenta (Matematica cuenta){
        cuenta.setNum1(Math.random()*10);
        cuenta.setNum2(Math.random()*10);
        return cuenta;
    }
    public void devolverMayor (Matematica cuenta){
        double mayor;
        mayor = Math.max(cuenta.getNum1(), cuenta.getNum2());
        System.out.println("El numero mas grande es: " + mayor);
    }
    public int calcularPotencia (Matematica cuenta){
        int num1, num2, pot;
        num1 = (int) Math.round(cuenta.getNum1());
        num2 = (int) Math.round(cuenta.getNum2());
        pot = (int) Math.pow(Math.max(num1, num2), Math.min(num1, num2));
    
        return pot;
    }
    public double calcularRaiz (Matematica cuenta){
        double num1, num2;
        int raiz, menor;
        num1 = Math.abs(cuenta.getNum1());
        num2 = Math.abs(cuenta.getNum2());
        menor = (int) Math.min(num1, num2);
        raiz = (int) Math.sqrt(menor);
        return raiz;
    }
}
