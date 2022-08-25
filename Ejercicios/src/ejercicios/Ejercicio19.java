/
 19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio19 {

  
    public static void main(String[] args) {
        
       int[][] matrizU = new int [3][3];
       int[][] matrizTrs = new int [3][3];
       int cont =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizU[i][j] =  (int) (Math.random()*(3-(-3)+1)+(-3));
                if (matrizU[i][j]%2==0) {
                    matrizU[i][j] = matrizU[i][j]*-1;
                }
                if (i==0 && i==2) {
                    System.out.print(matrizU[i][j] + "   ");
                } else
                    System.out.print(matrizU[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizTrs[i][j] = matrizU[i][j]*-1;
                   if (i==0 && i==2) {
                    System.out.print(matrizTrs[i][j] + " ");
                } else
                    System.out.print(matrizTrs[i][j]);
            }
            System.out.println(" ");
        }
    }
}

