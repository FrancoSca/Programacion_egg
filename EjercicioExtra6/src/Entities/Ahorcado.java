/*

 */
package Entities;

/**
 *
 * @author Juan Cruz
 */
public class Ahorcado {

    private String[] palabra;
    private String[] palabraDos;
    private int letrasEncontradas;
    private int cantidadIntentos;
    private String[] solucion;
    private String[] solucionDos;
    private String jugUno;
    private String jugDos;
    private int puntJugUno;
    private int puntJugDos;
    private int turnos;
    public Ahorcado() {
    }

    public Ahorcado(int turnos, String[] palabra, int letrasEncontradas, int cantidadIntentos, String[] solucion, String jugUno, String JugDos, int puntJugDos, int puntJugUno, String[] palabraDos, String[] solucionDos) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadIntentos = cantidadIntentos;
        this.solucion = solucion;
        this.jugDos = jugDos;
        this.jugUno = jugUno;
        this.puntJugDos = puntJugDos;
        this.puntJugUno = puntJugUno;
        this.palabraDos = palabraDos;
        this.solucionDos = solucionDos;
        this.turnos = turnos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public String[] getSolucion() {
        return solucion;
    }

    public void setSolucion(String[] solucion) {
        this.solucion = solucion;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public String getJugUno() {
        return jugUno;
    }

    public void setJugUno(String jugUno) {
        this.jugUno = jugUno;
    }

    public String getJugDos() {
        return jugDos;
    }

    public void setJugDos(String jugDos) {
        this.jugDos = jugDos;
    }

    public int getPuntJugUno() {
        return puntJugUno;
    }

    public void setPuntJugUno(int puntJugUno) {
        this.puntJugUno = puntJugUno;
    }

    public int getPuntJugDos() {
        return puntJugDos;
    }

    public void setPuntJugDos(int puntJugDos) {
        this.puntJugDos = puntJugDos;
    }

    public String[] getPalabraDos() {
        return palabraDos;
    }

    public void setPalabraDos(String[] palabraDos) {
        this.palabraDos = palabraDos;
    }

    public String[] getSolucionDos() {
        return solucionDos;
    }

    public void setSolucionDos(String[] solucionDos) {
        this.solucionDos = solucionDos;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", cantidadIntentos=" + cantidadIntentos + ", solucion=" + solucion + '}';
    }
    
}
