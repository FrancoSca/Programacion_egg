
import Entidades.Persona;
import Servicios.ServPersona;

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
        Persona pers2 = new Persona();
        Persona pers3 = new Persona();
        Persona pers4 = new Persona();
        boolean [] vector1 = new boolean [4];
        double [] vector2 = new double[4];
        ServPersona serv = new ServPersona();
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    pers = serv.crearPersona(pers);
                    vector1[i] = serv.esMayorDeEdad(pers);
                    vector2[i] = serv.calcularImc(pers);
                    System.out.println("La persona " + pers.getNombre() + " pesa: " + pers.getPeso() + " y mide: " + pers.getAltura());
                    System.out.println("El imc de la persona es : " + vector2[i]);
                    break;
                case 1:
                    pers2 = serv.crearPersona(pers2);
                    vector1[i] = serv.esMayorDeEdad(pers2);
                    vector2[i] = serv.calcularImc(pers2);
                    System.out.println("La persona " + pers2.getNombre() + " pesa: " + pers2.getPeso() + " y mide: " + pers2.getAltura());
                    System.out.println("El imc dea la persona es : " + vector2[i]);
                    break;
                case 2:
                    pers3 = serv.crearPersona(pers3);
                    vector1[i] = serv.esMayorDeEdad(pers3);
                    vector2[i] = serv.calcularImc(pers3);
                    System.out.println("La persona " + pers3.getNombre() + " pesa: " + pers3.getPeso() + " y mide: " + pers3.getAltura());
                    System.out.println("El imc de la persona es : " + vector2[i]);
                    break;
                case 3:
                    pers4 = serv.crearPersona(pers4);
                    vector1[i] = serv.esMayorDeEdad(pers4);
                    vector2[i] = serv.calcularImc(pers4);
                    System.out.println("La persona " + pers4.getNombre() + " pesa: " + pers4.getPeso() + " y mide: " + pers4.getAltura());
                    System.out.println("El imc de la persona es : " + vector2[i]);
                    break;
            }
        }
        int mayor =0;
        int menor = 0;
        int pesId =0;
        int pesBaj =0;
        int sobrePes =0;
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    vector1[i] = serv.esMayorDeEdad(pers);
                    vector2[i] = serv.resultadoImc(pers);
                    break;
                case 1:
                    vector1[i] = serv.esMayorDeEdad(pers2);
                    vector2[i] = serv.resultadoImc(pers2);
                    break;
                case 2:
                    vector1[i] = serv.esMayorDeEdad(pers3);
                    vector2[i] = serv.resultadoImc(pers3);
                    break;
                case 3:
                    vector1[i] = serv.esMayorDeEdad(pers4);
                    vector2[i] = serv.resultadoImc(pers4);
                    break;
                default:
                    break;
            }
        
            if (vector1[i] == true) {
                mayor ++;
            } else {
                menor ++;
            }
            switch ((int)vector2[i]) {
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
        System.out.println("El porcentaje de personas mayor de edad es: " + ((mayor*100)/4) + "% y el porcentaje de menores de edad es: " + (menor*100)/4);
        System.out.println("El porcentaje de personas con sobrepeso es : " + ((sobrePes*100)/4) + "%, el porcentaje personas con peso ideal es: " + ((pesId*100)/4) + "% y la cantidad de personas con peso bajo es: " + ((pesBaj*100)/4) + "%");
    }
    
}
