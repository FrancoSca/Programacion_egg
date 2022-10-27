package servicio;

import entidad.Jugador;
import java.util.Scanner;

public class servicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Jugador cargarJug = new Jugador();

    public boolean disparo(servicioRevolver r, Jugador CargarJug) {
        System.out.println("El revolver ya esta listo, desea Apretar el gatillo");
        String resp = leer.next();
        boolean band = false;
        if (resp.equalsIgnoreCase("si")) {
            if (r.mojar()) {
                band = true;
            } else {
                r.siguienteChorro();
            }
        }else{
            System.out.println("Sos un Cagon");
        }
        return band;
    }
}
