/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicios;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServMes {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mes crearMes (Mes mes){
        mes.setMeses(new String[]{"enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"});
        mes.setMesSecreto((int)(Math.random()*12));
        
        return mes;
    }
    public boolean buscarMes (Mes mes){
        boolean Verif=true;
        System.out.println("Adivine el mes secreto: ");
        String mesSec = leer.next();
        Verif = mesSec.equals(mes.getMeses()[mes.getMesSecreto()]);
        return Verif;
    }
}
