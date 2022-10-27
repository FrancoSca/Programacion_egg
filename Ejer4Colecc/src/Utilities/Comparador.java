/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Entities.Pelicula;
import java.util.Comparator;


/**
 *
 * @author FrancoSca
 */
public class Comparador {
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirec().compareTo(p2.getDirec());
        }
    };
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
}
