package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author FrancoSca
 */
public class ServCafetera {
    Scanner leer = new Scanner(System.in);
    public Cafetera crearCafetera (Cafetera cafe){
        cafe.setCantAct(300);
        cafe.setCapMaxima(1000);
        return cafe;
    }
    public void llenarCafetera(Cafetera cafe){
        System.out.println("Llenando cafetera....");
        cafe.setCantAct(cafe.getCapMaxima());
        System.out.println("Cafetera lista !");
    }
    public void servirTaza(Cafetera cafe){
        System.out.println("Ingrese el tamaño de la taza a servir: ");
        System.out.println("1- Comun (100ml)");
        System.out.println("2- Grande (200ml)");
        System.out.println("3- Extra (300ml)");
        int elec = leer.nextInt();
        switch (elec){
            case 1:
                if (cafe.getCantAct()>100){
                    System.out.println("Taza llena, que disfute si café !");
                    cafe.setCantAct(cafe.getCantAct()-100);
                    System.out.println("La cantidad de cafe restante es de: " + cafe.getCantAct() +"ml");
                } else if (cafe.getCantAct()<100){
                    System.out.println("La taza no se pudo llenar, se sirvieron: " + cafe.getCantAct()+"ml");
                    cafe.setCantAct(0);
                }
                 break;
            case 2:
                if (cafe.getCantAct()>200){
                    System.out.println("Taza llena, que disfute si café !");
                    cafe.setCantAct(cafe.getCantAct()-200);
                    System.out.println("La cantidad de cafe restante es de: " + cafe.getCantAct() +"ml");
                } else if (cafe.getCantAct()<200){
                    System.out.println("La taza no se pudo llenar, se sirvieron: " + cafe.getCantAct()+"ml");
                    cafe.setCantAct(0);
                }
                break;
            case 3:
                if (cafe.getCantAct()>300){
                    System.out.println("Taza llena, que disfute si café !");
                    cafe.setCantAct(cafe.getCantAct()-300);
                    System.out.println("La cantidad de cafe restante es de: " + cafe.getCantAct() +"ml");
                } else if (cafe.getCantAct()<300){
                    System.out.println("La taza no se pudo llenar, se sirvieron: " + cafe.getCantAct()+"ml");
                            cafe.setCantAct(0);
                }
                break;
                default:
                    System.out.println("La opcion ingresada es incorrecta.");
                    
        }
    }
    public void vaciarCafetera (Cafetera cafe){
        System.out.println("Vaciando la cafetera.....");
        cafe.setCantAct(0);
        System.out.println("Cafetera vaciada correctamente !");
    }
    public void agregarCafe (Cafetera cafe){
        System.out.println("Ingrese la cantidad de café que desea agregar: ");
        int cant = leer.nextInt();
        if ((cant + cafe.getCantAct())> cafe.getCapMaxima()) {
            System.out.println("La cantidad deseada sobrepasa el maximo de la cafetera");
            System.out.println("Se agregaron: " + (cafe.getCapMaxima()-cafe.getCantAct()) + "ml");
            cafe.setCantAct(cafe.getCapMaxima());
        }else{
            System.out.println("Se agregaron: " + cant + "ml de café");
            cafe.setCantAct(cafe.getCantAct()+cant);
            System.out.println("La capacidad actual es: " + cafe.getCantAct());
        }
        
    }
}
