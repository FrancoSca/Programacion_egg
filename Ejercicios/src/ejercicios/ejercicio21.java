/*21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicios;


public class ejercicio21 {
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        llenaMatrizM(matrizM);
        matrizM[7][7] = 0;
        matrizM[1][1]= 0;
        llenaMatrizP(matrizP);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            if (i==0 && i==9) {
                    System.out.print(matrizM[i][j] + "   ");
                } else
                    System.out.print(matrizM[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("============================");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0 && i==2) {
                    System.out.print(matrizP[i][j] + "   ");
                } else
                    System.out.print(matrizP[i][j]);
            }
            System.out.println(" ");
            }
        encontrarMatriz(matrizM, matrizP);
    }
    public static int[][] llenaMatrizM(int[][] matrizM) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i <4 || i >6 || j<4 || j>6) {
                    matrizM[i][j] = (int) (Math.random()*2);
                  //   matrizM[i][j] = 1;
                } else {
                    matrizM[i][j]= (int) (Math.random()*2);
                    // matrizM[i][j] = 0;
                }
                
            }
        }
        return matrizM;
    }
     public static int[][] llenaMatrizP(int[][] matrizP) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // matrizP[i][j] = (int) (Math.random()*2);
                matrizP[i][j] = 0;
            }
        }
        return matrizP;
    }
     public static void encontrarMatriz(int[][] matrizM, int[][] matrizP ){
         int posY=0;
         int posX=0;
         int cont =0;
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((matrizM[i][j] == matrizP[0][0]) && (cont != 9 || cont ==0)) {
                    cont=0;
                    for (int k = i - i; k < 3; k++) {
                        for (int l = j - j; l < 3; l++) {
                            if ((matrizP[k][l] == matrizM[i + k][j + l]) && cont < 9) {
                                cont++;
                                posY = i;
                                posX = j;
                            } else if (matrizP[k][l] != matrizM[i + k][j + l] && cont !=9) {
                                cont = 0;
                                break;
                            }
                        }

                    }
                
            }else if (cont ==9) {
                     break;
                 }
        }
    }
         System.out.println("============================");
         if (cont == 9) {
             System.out.println("La matriz P se encuentra en la posicion " + posY + "," + posX);
         } else {
             System.out.println("La matriz P no se encuentra en la matriz M");
         }
    }
}

