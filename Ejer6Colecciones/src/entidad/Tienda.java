/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package entidad;

import java.util.HashMap;

/**
 *
 * @author FrancoSca
 */
public class Tienda {
    
    private HashMap <String, Integer> producto;
    public Tienda() {
    }

    public Tienda(HashMap<String, Integer> producto) {
        this.producto = producto;
    }

    public HashMap<String, Integer> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Integer> producto) {
        this.producto = producto;
    }


    
}
