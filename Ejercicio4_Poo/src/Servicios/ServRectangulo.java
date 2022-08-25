package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServRectangulo {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRect (Rectangulo rec){
        System.out.println("Ingrese la base y la altula del rectangulo: ");
        rec.setBase(leer.nextInt());
        rec.setAltura(leer.nextInt());
        return rec;
    }
    public int perimetro(Rectangulo rec){
        return ((rec.getBase()+rec.getAltura())*2);
    }
    public int superficie(Rectangulo rec){
       return (rec.getAltura()*rec.getBase());
    }
    public void mostrarRectangulo(Rectangulo rec){
        for (int i = 0; i < rec.getBase(); i++) {
            for (int j = 0; j < rec.getAltura(); j++) {
                if (i == rec.getBase()-1 || j == rec.getAltura()-1 || i == 0 || j == 0) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            
        }
    }
}
