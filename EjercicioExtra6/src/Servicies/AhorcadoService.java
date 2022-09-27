/*

 */
package Servicies;

import Entities.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class AhorcadoService {

    Scanner leer;

    public AhorcadoService() {

        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Ahorcado crearJuego() {

        Ahorcado ahorcadoEj = new Ahorcado();
        multijugador(ahorcadoEj);
        if (multijugador(ahorcadoEj) == false) {
            System.out.println("Ingrese la palabra a buscar: ");
            String palabraBuscar = leer.next();

            String[] palabraVector = new String[palabraBuscar.length()];
            String[] solucionVector = new String[palabraBuscar.length()];

            for (int i = 0; i < palabraBuscar.length(); i++) {

                palabraVector[i] = palabraBuscar.substring(i, i + 1);
                if (i != 0) {
                    solucionVector[i] = "_";
                } else if (i == 0) {
                    solucionVector[i] = palabraBuscar.substring(i, i + 1).toUpperCase();
                }

            }

            ahorcadoEj.setPalabra(palabraVector);
            ahorcadoEj.setSolucion(solucionVector);

            ahorcadoEj.setCantidadIntentos(6);
            ahorcadoEj.setLetrasEncontradas(0);

            return ahorcadoEj;
        } else {
            ahorcadoEj.setTurnos(1);
            if (ahorcadoEj.getTurnos() % 2 != 0) {
            System.out.println("jugador " + ahorcadoEj.getPuntJugUno() + " ingrese la palabra: ");
            String palabraBuscar = leer.next();
            String[] palabraVector = new String[palabraBuscar.length()];
            String[] solucionVector = new String[palabraBuscar.length()];
            
            for (int i = 0; i < palabraBuscar.length(); i++) {

                palabraVector[i] = palabraBuscar.substring(i, i + 1);
                if (i != 0) {
                    solucionVector[i] = "_";
                } else if (i == 0) {
                    solucionVector[i] = palabraBuscar.substring(i, i + 1).toUpperCase();
                }

            }
            
            
            return ahorcadoEj;
            } else {
              System.out.println("jugador " + ahorcadoEj.getPuntJugDos()+ " ingrese la palabra: ");
            String palabraBuscarDos = leer.next();
            String[] palabraVectorDos = new String[palabraBuscarDos.length()];
            String[] solucionVector = new String[palabraBuscarDos.length()];
            
            for (int i = 0; i < palabraBuscarDos.length(); i++) {

                palabraVectorDos[i] = palabraBuscarDos.substring(i, i + 1);
                if (i != 0) {
                    solucionVector[i] = "_";
                } else if (i == 0) {
                    solucionVector[i] = palabraBuscarDos.substring(i, i + 1).toUpperCase();
                }

            }
            
        }
        return ahorcadoEj;
        }   
    }

    public void longitud(Ahorcado ahorcadoEj) {

        System.out.println("La longitud de la palabra a encontrar es: " + ahorcadoEj.getPalabra().length);
    }

    public boolean encontradas(String letra, Ahorcado ahorcadoEj) {

        int contador = 0;
        int repetidas = 0;

        String[] solucionVector = ahorcadoEj.getSolucion();
        if (letra.length() == 1) {
            for (int i = 0; i < ahorcadoEj.getPalabra().length; i++) {

                if (letra.equalsIgnoreCase(ahorcadoEj.getPalabra()[i]) && !letra.equalsIgnoreCase(ahorcadoEj.getSolucion()[i])) {
                    contador++;

                    solucionVector[i] = letra;

                } else if (letra.equalsIgnoreCase(ahorcadoEj.getPalabra()[i]) && letra.equalsIgnoreCase(ahorcadoEj.getSolucion()[i])) {

                    repetidas++;
                }
            }
            ahorcadoEj.setSolucion(solucionVector);

            if (contador != 0) {
                if (contador != ahorcadoEj.getPalabra().length) {
                    ahorcadoEj.setLetrasEncontradas(ahorcadoEj.getLetrasEncontradas() + contador);

                    System.out.println("La letra está contenida dentro de la palabra.");
                    System.out.println("Número de letras (encontradas, faltantes): ( " + ahorcadoEj.getLetrasEncontradas() + ", " + (ahorcadoEj.getPalabra().length - ahorcadoEj.getLetrasEncontradas()) + " )");
                    mostrarMunieco(ahorcadoEj);
                    System.out.println(Arrays.toString(ahorcadoEj.getSolucion()));
                } else {
                    System.out.println("Felicitaciones, adivino la palabra !!");
                }

                return true;

            } else if (repetidas != 0) {

                System.out.println("Escribió una letra repetida. Perdió una chance por gil.");
                return false;

            } else {

                System.out.println("La letra NO está contenida dentro de la palabra.");
                System.out.println("Perdió una chance.");

                return false;
            }
        } else if (letra.length() == ahorcadoEj.getPalabra().length) {
            for (int i = 0; i < ahorcadoEj.getPalabra().length; i++) {
                if (letra.substring(i, i + 1).equalsIgnoreCase(ahorcadoEj.getPalabra()[i])) {
                    contador++;
                    solucionVector[i] = letra;
                } else {
                    contador = 0;
                }
            }

            if (contador == ahorcadoEj.getPalabra().length) {
                ahorcadoEj.setLetrasEncontradas(contador);
                System.out.println("Felicidades, adivino la palabra completa !!");
                return true;
            } else {
                System.out.println("La palabra ingresada era incorrecta !!");
                System.out.println("La palabra era: " + Arrays.toString(ahorcadoEj.getPalabra()));
                return false;
            }
        } else {
            System.out.println("La palabra ingresada era incorrecta !!");
            System.out.println("La palabra era: " + Arrays.toString(ahorcadoEj.getPalabra()));
            return false;
        }
    }

    public void intentos(Ahorcado ahorcadoEj) {

        System.out.println("Le quedan " + ahorcadoEj.getCantidadIntentos() + " intentos.");
    }

    public void mostrarAhorcado(Ahorcado ahorcadoEj) {
        Arrays.toString(ahorcadoEj.getSolucion());
    }

    public void mostrarMunieco(Ahorcado ahorcadoEj) {
        switch (ahorcadoEj.getCantidadIntentos()) {
            case 0:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |             -|- ");
                System.out.println("  |             / \\");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 1:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |             -|- ");
                System.out.println("  |             / ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 2:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |             -|- ");
                System.out.println("  |             ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 3:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |             -| ");
                System.out.println("  |             ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 4:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |              |");
                System.out.println("  |             ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 5:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              O");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
            case 6:
                System.out.println("  ---------------");
                System.out.println("  |              |");
                System.out.println("  |              ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" / \\");
                break;
        }
    }

    public void espacio() {
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
    }

    public boolean multijugador(Ahorcado ahorcadoEj) {
        System.out.println("ingrese la cantidad de jugadores: (1 o 2)");
        int elec = leer.nextInt();
        if (elec == 1) {
            return false;
        } else {
            System.out.println("Ingrese nombre del jugador 1: ");
            ahorcadoEj.setJugUno(leer.next());
            ahorcadoEj.setPuntJugUno(0);
            System.out.println("Ingrese nombre del jugador 2: ");
            ahorcadoEj.setJugDos(leer.next());
            ahorcadoEj.setPuntJugDos(0);
            return true;
        }
    }

    public void juego() {
        String elec = "a";
        do {
            Ahorcado ahorcadoEj = crearJuego();
            espacio();
            System.out.println("------------------------------------------");
            System.out.println(Arrays.toString(ahorcadoEj.getSolucion()));
            longitud(ahorcadoEj);

            while (ahorcadoEj.getCantidadIntentos() != 0 && ahorcadoEj.getLetrasEncontradas() != ahorcadoEj.getPalabra().length) {
                System.out.println("Ingrese una letra o la palabra completa: ");
                System.out.println("¡¡ En caso de colocar una palabra arriesgara todos sus intentos !!");
                String letra = leer.next();
                if (letra.length() == 1) {
                    boolean encontrarLetra = encontradas(letra, ahorcadoEj);

                    if (!encontrarLetra) {

                        ahorcadoEj.setCantidadIntentos(ahorcadoEj.getCantidadIntentos() - 1);
                        mostrarMunieco(ahorcadoEj);
                        System.out.println(Arrays.toString(ahorcadoEj.getSolucion()));
                    }

                    System.out.println(ahorcadoEj.getCantidadIntentos());
                } else {
                    boolean encontrarLetra = encontradas(letra, ahorcadoEj);
                    if (!encontrarLetra) {
                        ahorcadoEj.setCantidadIntentos(0);
                        mostrarMunieco(ahorcadoEj);
                    }
                }
            }
            System.out.println("Desea volver a jugar ?? (S/N)");
            elec = leer.next();

            

        } while (!elec.equalsIgnoreCase("n"));
        System.out.println("------------------------------------------");
    }
}
