
package entidad;

import java.util.HashSet;
import java.util.Objects;


public class Juego {
   private HashSet <Jugador> Jugadores;
   private Revolver revolver;

    public Juego() {
    }

    public Juego(HashSet<Jugador> Jugadores, Revolver revolver) {
        this.Jugadores = Jugadores;
        this.revolver = revolver;
    }

    public HashSet<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(HashSet<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Jugadores);
        hash = 37 * hash + Objects.hashCode(this.revolver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.Jugadores, other.Jugadores)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }
   
}
