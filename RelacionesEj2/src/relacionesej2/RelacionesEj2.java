package relacionesej2;

import servicio.servicioJuego;
import servicio.servicioJugador;
import servicio.servicioRevolver;


public class RelacionesEj2 {

    public static void main(String[] args) {
        servicioRevolver servRev = new servicioRevolver();
        servicioJugador servJug = new servicioJugador();
        servicioJuego servJueg = new servicioJuego();

       // servRev.llenarRevolver();
        servJueg.llenarJugadores();
        servJueg.ronda(); 

    }

}
