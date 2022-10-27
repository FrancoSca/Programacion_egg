/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServTienda {
    Scanner leer;
     HashMap <String, Integer> mapAux = new HashMap<>();
    public Tienda crearTienda (){
        Tienda t1 = new Tienda();
        t1.setProducto(mapAux);
        return t1;
    }
    
    public void agregarProducto(Tienda t1){
        leer = new Scanner(System.in).useDelimiter("\n");
         
//        for (Map.Entry<String, Integer> entry : t1.getProducto().entrySet()) {
//            mapAux.put(entry.getKey(),entry.getValue());
//        }
        System.out.println("Ingrese el nombre del producto: ");
        String nombProd = leer.next();
        System.out.println("Ingrese el precio del mismo: ");
        Integer precio = leer.nextInt();
        mapAux.put(nombProd, precio);
        t1.setProducto(mapAux);
    }
    
    public void modificarPrecio (Tienda t1){
        System.out.println("Ingrese el nombre del producto a modificar el precio:");
        String nombProd = leer.next();
        for (Map.Entry<String, Integer> en : t1.getProducto().entrySet()) {
            if (nombProd.equalsIgnoreCase(en.getKey())) {
                System.out.println("Ingrese el nuevo precio.");
                t1.getProducto().put(en.getKey(), leer.nextInt());
            } else {
                System.out.println("Producto no encontrado.");
            }
            
        }
      

    }
    
    public void eliminarProducto(Tienda t1) {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombProd = leer.next();
        for (Map.Entry<String, Integer> en : t1.getProducto().entrySet()) {
            if (nombProd.equalsIgnoreCase(en.getKey())) {
                t1.getProducto().remove(en.getKey());
                System.out.println("El producto " + nombProd + " fue eliminado.");
            } else {
                System.out.println("Producto no encontrado.");
            }

        }


    }
    
    public void mostrarProductos (Tienda t1){
        System.out.println("Los productos extistentes son: ");
//        System.out.println(t1.getProducto().toString());
for (Map.Entry<String, Integer> entry : t1.getProducto().entrySet()) {
          System.out.println(entry.getKey() + entry.getValue());
            
        }
        
    }
    
    public void Menu (Tienda t1){
        boolean band = true;
        leer = new Scanner(System.in).useDelimiter("\n");
        int elec;
        while (band) {            
        System.out.println("------------ MENU -----------");
        System.out.println("1) Agregar producto");
        System.out.println("2) Modificar precio");        
        System.out.println("3) Eliminar producto");                
        System.out.println("4) Mostrar productos");   
        System.out.println("5) Salir ");
        elec = leer.nextInt();
        switch (elec){
            case 1:
                agregarProducto(t1);
                break;
            case 2:
                modificarPrecio(t1);
                break;
            case 3:
                eliminarProducto(t1);
                break;
            case 4:
                mostrarProductos(t1);
                break;
            case 5:
                band = false;
                break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
        }
        }
    }
}
