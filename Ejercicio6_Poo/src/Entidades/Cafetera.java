
package Entidades;

/**
 *
 * @author FrancoSca
 */
public class Cafetera {
    private int cantAct;
    private int capMaxima;

    public Cafetera(int cantAct, int capMaxima) {
        this.cantAct = cantAct;
        this.capMaxima = capMaxima;
    }

    public Cafetera() {
    }

    public int getCantAct() {
        return cantAct;
    }

    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    
}
