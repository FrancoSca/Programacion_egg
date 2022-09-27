/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author Samu Noah
 */
public class NewMain12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cen, dec, uni;

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                cen = "E";
            } else {
                cen = String.valueOf(i);
            }
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    dec = "E";
                } else {
                    dec = String.valueOf(j);
                }
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        uni = "E";
                    } else {
                        uni = String.valueOf(k);
                    }
                    System.out.println(cen + " - " + dec + " - " + uni );
                }
            }
        }
    }
}