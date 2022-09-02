
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase: ");
        frase.setFrase(leer.next());
        frase.setLongitud(frase.getFrase().length());
        return frase;
    }
    public void mostrarVocales(Cadena frase){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equalsIgnoreCase("a") || frase.getFrase().substring(i, i+1).equalsIgnoreCase("e") || frase.getFrase().substring(i, i+1).equalsIgnoreCase("i") || frase.getFrase().substring(i, i+1).equalsIgnoreCase("o") || frase.getFrase().substring(i, i+1).equalsIgnoreCase("u")) {
                cont ++;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + cont);
    }
    public void invertirFrase (Cadena frase){
        for (int i = frase.getLongitud()-1; i >= 0; i--) {
            System.out.print(frase.getFrase().substring(i, i+1));
        }
        System.out.println("");
    }
    public void vecesRepetido (Cadena frase){
        int cont =0;
        System.out.println("Que letra desea contar dentro de la frase ?");
        String letra = leer.next();
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i+1))) {
                cont ++;
            }
        }
        System.out.println("La letra " + letra + " aparace " + cont + " veces.");
    }
    public void compararLongitud (Cadena frase){
        System.out.println("Ingrese otra frase para comparar longitudes: ");
        String frase2 = leer.next();
        if (frase2.length() == frase.getLongitud()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (frase2.length()> frase.getLongitud()) {
            System.out.println("La frase 2 tiene " + ( frase2.length() - frase.getLongitud()) + " caracteres mas.");
        } else {
            System.out.println("la frase 1 tiene " + (frase.getLongitud() - frase2.length()) + " caracteres mas.");
        }
    }
    public void unirFrases(Cadena frase){
        String frasesUnidas;
        String frase2;
        System.out.println("Ingrese una frase para agregar a la frase: ");
        frase2 = leer.next();
        frasesUnidas = frase.getFrase().concat(frase2);
        System.out.println(frasesUnidas);
    }
    public void reemplazar (Cadena frase){
        String fraseCambiada;
        System.out.println("Ingrese un caracter por el cual cambiar todas las letras 'A' ");
        String letra = leer.next();
        fraseCambiada = frase.getFrase().replaceAll("a", letra);
        System.out.println(fraseCambiada);
    }
    public boolean contiene (Cadena frase){
        boolean retorno = false;
        System.out.println("Ingrese un caracter para buscar en la frase: ");
        String letra = leer.next();
        for (int i = 0; i < frase.getLongitud(); i++) {
            retorno = frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra);
        }
        return retorno;
    }
}

