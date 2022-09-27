
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
