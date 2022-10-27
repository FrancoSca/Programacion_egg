package servicio;

import entidad.Jugador;
import java.util.ArrayList;

import java.util.Scanner;

public class servicioJuego {

    ArrayList<Jugador> integrantes;
    Jugador sj = new Jugador();
    servicioRevolver servRev = new servicioRevolver();
    servicioJugador servJug = new servicioJugador();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJugadores() {
        integrantes = new ArrayList();

        System.out.println("Cuantos jugadores juega? ");
        int resp = leer.nextInt();
        if (resp > 6 && resp < 1) {
            resp = 6;
        }
        int cont = 0;
        do {
            Jugador auxju = new Jugador();
            System.out.println("Ingrese su nombre");
            auxju.setNombre(leer.next());
            auxju.setId((cont + 1));
            System.out.println("Su ID: " + auxju.getId());
            cont++;
            integrantes.add(auxju);
        } while (resp != cont);

    }

    public void ronda() {
        servRev.llenarRevolver();
            for (int i = 0; i < integrantes.size(); i++) {
            servRev.mostrarPosiciones();
            integrantes.get(i).setMojado(servJug.disparo(servRev, sj));
            if (integrantes.get(i).isMojado()) {
                integrantes.get(i).setMojado(true);
                System.out.println("El jugador " +integrantes.get(i).getNombre()+ " paso a mejor vida.");
                break;
            } 
        }
        imprimirLista();
    }

    public void imprimirLista() {
        for (Jugador integrante : integrantes) {
            System.out.println(integrante.toString());
        }

    }
}
