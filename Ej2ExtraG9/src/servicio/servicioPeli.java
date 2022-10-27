
package servicio;

import entidad.Pelicula;
import enumerador.enumeradorClasificacion;


public class servicioPeli {

    public Pelicula crearPeliculaUno(){
            Pelicula pel1 = new Pelicula();
        pel1.setDirector("James Cameron");
        pel1.setDuracion(3.14);
        pel1.setNombre("Titanic");
        pel1.setClasif(enumeradorClasificacion.MAYOR13);
        pel1.setPrecio(1120);
        return pel1;
        }
    public Pelicula crearPeliculaDos(){
        Pelicula pel2 = new Pelicula();
        pel2.setDirector("Roger Allers");
        pel2.setDuracion(1.27);
        pel2.setClasif(enumeradorClasificacion.ATP);
        pel2.setNombre("El rey Leon");
        pel2.setPrecio(900);
        return pel2;
        }
    
}
