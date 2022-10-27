/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Asiento;
import entidad.Pelicula;
import entidad.Persona;
import entidad.Sala;
import enumerador.EnumeradorFila;
import enumerador.EnumeradorNumero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class ServicioSala {

    private ServicioPersona sp1;
    private Pelicula peli;
    Scanner leer;
    
    public ServicioSala() {
        this.sp1 = sp1;
    }
    ArrayList<Asiento> sala;

    Sala s1;
        
    public Sala crearSala() {

        sala = new ArrayList();
        for (EnumeradorNumero columna : EnumeradorNumero.values()) {
            for (EnumeradorFila fila : EnumeradorFila.values()) {
                sala.add(new Asiento(fila, columna));
            }
        }
        s1 = new Sala();

        s1.setListaAsientos(sala);

        return s1;

    }

    public void mostrarSala(Sala sala) {
        for (int i = this.sala.size()-1; i > -1; i--) {
            if ((this.sala.get(i).getFila().toString().equals("B") || this.sala.get(i).getFila().toString().equals("C")) || (this.sala.get(i).getColumna().toString().equalsIgnoreCase("1") ||  this.sala.get(i).getColumna().toString().equalsIgnoreCase("2"))) {
                this.sala.get(i).setOcupado(true);
            }
            if (this.sala.get(i).isOcupado()) {
                System.out.print(this.sala.get(i).getColumna().getValor() + "");
                System.out.print(this.sala.get(i).getFila()+ "X|");
            }
            else{
            if (this.sala.get(i).getFila().toString().equals("A")) {
                System.out.print(this.sala.get(i).getColumna().getValor() + "");
                System.out.println(this.sala.get(i).getFila()+ " |");

            }else {
                System.out.print(this.sala.get(i).getColumna().getValor() + "");
                System.out.print(this.sala.get(i).getFila()+ " |");
            }
            }
        }
        System.out.println("");

    }

    public void asignarPelicula(Pelicula pel1){
        
        s1.setPeli(peli);
        
    }
    
    
    public void asignarAsiento(Sala s1, Persona Espec) {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija el asiento deseado, los asientos que aparecen con una X estan ocupados: (Ingrese fila y numero)");
        mostrarSala(s1);
        String fil = leer.next();
        String columna = leer.next();
        if (Espec.getDineroDisponible() >= s1.getPeli().getPrecio() && Espec.getEdad() >= s1.getPeli().getClasif().getEdad()) {

            for (int i = 0; i < EnumeradorNumero.values().length; i++) {
                for (EnumeradorFila fila : EnumeradorFila.values()) {
                    if (s1.getListaAsientos().get(i).getColumna().getValor().equalsIgnoreCase(columna) && s1.getListaAsientos().get(i).getFila().getValor().equalsIgnoreCase(fil)) {
                        if (!s1.getListaAsientos().get(i).isOcupado()) {
                            System.out.println("El asiento esta ocupado.");
                        } else {
                            s1.getListaAsientos().get(i).setOcupado(true);
                            s1.getListaAsientos().get(i).setEspec(Espec);
                            System.out.println("El asiento asignado fue: " + s1.getListaAsientos().get(i).getColumna() + " " + s1.getListaAsientos().get(i).getFila());
                            System.out.println("Disfrute la pelicula !!");
                        }
                    }

                }

            }
        } else if (Espec.getDineroDisponible() < s1.getPeli().getPrecio()) {
            System.out.println("Usted no posee dinero suficiente para la pelicula :c");
        } else if (Espec.getEdad() < s1.getPeli().getClasif().getEdad()) {
            System.out.println("No tiene la edad necesaria para ver el film.");
        }

    }

}
