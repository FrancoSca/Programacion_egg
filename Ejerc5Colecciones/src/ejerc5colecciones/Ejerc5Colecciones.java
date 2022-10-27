
package ejerc5colecciones;

import Service.ServPais;


public class Ejerc5Colecciones {

    public static void main(String[] args) {
        
        ServPais serv = new ServPais();
        
        serv.crearPais();
        serv.llenarPaises();
        serv.mostrarPaises();
        serv.eliminarPais();
    }
    
}
