
package servicio;

import entidad.Revolver;

public class servicioRevolver {
    Revolver cargarRev = new Revolver();
    public Revolver llenarRevolver() {
        cargarRev.setPosicionActual((int) (Math.random() * (1 - 6) + 6));
        cargarRev.setPosicionAgua((int) (Math.random() * (1 - 6) + 6));
        System.out.println(cargarRev.toString());
        return cargarRev;
    }
    
    public boolean mojar() {
        boolean mojar = false;
        if (cargarRev.getPosicionActual() == cargarRev.getPosicionAgua()) {//se puede utilizar equal
            mojar = true;
        }
        return mojar;
    }

    public void siguienteChorro() {
        if (cargarRev.getPosicionActual() < 6) {
            cargarRev.setPosicionActual(cargarRev.getPosicionActual() + 1);
        } else if (cargarRev.getPosicionActual() == 6) {
            cargarRev.setPosicionActual(1);
        }
        System.out.println(cargarRev.toString());
    }
    
    public void mostrarPosiciones(){
        System.out.println(cargarRev.toString());
    }
}
