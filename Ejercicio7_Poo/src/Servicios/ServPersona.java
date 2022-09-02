/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• //Un constructor por defecto.
• //Un constructor con todos los atributos como parámetro.
• //Métodos getters y setters de cada atributo.
• //Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• //Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
• // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona pers) {
        System.out.println("Ingrese el nombre de la persona: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        pers.setEdad(leer.nextInt());
        char sexo;
        do {
            System.out.println("ingrese el sexo de la persona:");
            System.out.println("(M para masculino, F para femenino, O para otro.)");
            sexo = leer.next().toLowerCase().charAt(0);
            if (sexo == 'm' || sexo == 'f' || sexo == 'o') {
                pers.setSexo(sexo);
            } else {
                System.out.println("La opcion ingresada es erronea.");
            }

        } while (sexo != pers.getSexo());
        System.out.println("ingrese la altura de la persona en centimetros: ");
        pers.setAltura(leer.nextInt());
        System.out.println("Ingrese el peso de la persona: ");
        pers.setPeso(leer.nextInt());

        return pers;
    }

    public double calcularImc(Persona pers) {
        double alt = (double) pers.getAltura() / 100;
        double imc = (pers.getPeso() / (Math.pow(alt, 2)));
        pers.setImc(imc);
        return pers.getImc();
    }

    public int resultadoImc(Persona pers) {
        if (pers.getImc() < 20) {
            pers.setResImc(-1);
        } else if (pers.getImc() > 20 && pers.getImc() < 25) {
            pers.setResImc(0);
        } else if (pers.getImc() > 25) {
            pers.setResImc(1);
        }
        
        return pers.getResImc();
    }

    public boolean esMayorDeEdad(Persona pers) {
        boolean esMayor;
        esMayor = pers.getEdad() > 18;
        pers.setEsMayor(esMayor);
        return pers.getEsMayor();
    }
}
