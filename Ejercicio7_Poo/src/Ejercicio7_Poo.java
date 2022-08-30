
import Entidades.Persona;
import Servicios.ServPersona;
import java.util.Vector;

/*
 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
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

/**
 *
 * @author FrancoSca
 */
public class Ejercicio7_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
        Persona pers = new Persona();
        //Persona pers2 = new Persona();
        //Persona pers3 = new Persona();
        //Persona pers4 = new Persona();
        //Persona [] personas = new Persona [4];
        boolean [] vector1 = new boolean [4];
        int [] vector2 = new int [4];
        ServPersona serv = new ServPersona();
        pers = serv.crearPersona(pers);
        //pers2 = serv.crearPersona(pers2);
        //pers3 = serv.crearPersona(pers3);
        //pers4 = serv.crearPersona(pers4);
       // personas[0] = pers;
        //personas[1] = pers2;
        //personas[2] = pers3;
        //personas[3] = pers4;
        int mayor =0;
        int menor = 0;
        int pesId =0;
        int pesBaj =0;
        int sobrePes =0;
        for (int i = 0; i < 1; i++) {
            vector1[i] = serv.esMayorDeEdad(pers);
            vector2[i] = serv.calcularImc(pers);
            if (vector1[i] == true) {
                mayor ++;
            } else {
                menor ++;
            }
            switch (vector2[i]) {
                case 1:
                    sobrePes ++;
                    break;
                case 0:
                    pesId ++;
                    break;
                default:
                    pesBaj ++;
                    break;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("La persona " + pers.getNombre() + " pesa: " + pers.getPeso() + " y mide: " + pers.getAltura());
            System.out.println("El imc de la persona es : " + ((pers.getPeso())/(pers.getAltura()*pers.getAltura())));
        }
        System.out.println("El porcentaje de personas mayor de edad es: " + ((mayor*100)/1) + " y el porcentaje de menores de edad es: " + (menor*100)/1);
        System.out.println("El porcentaje de personas con sobrepeso es : " + ((sobrePes*100)/1) + ", el porcentaje personas con peso ideal es: " + ((pesId*100)/1) + " y la cantidad de personas con peso bajo es: " + (pesBaj*100)/1);
    }
    
}
