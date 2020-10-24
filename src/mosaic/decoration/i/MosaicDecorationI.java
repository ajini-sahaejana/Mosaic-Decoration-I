/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaic.decoration.i;

import java.util.Scanner;

/**
 *
 * @author Ajini Sahejana
 */
public class MosaicDecorationI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 0, cb = 0, cp = 0;
        double bi = 0, pi = 0;
        double bp = 0, pp = 0, tc = 0;
        
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a<= 100 && a>= 2){
                n = a;
            }
            int b = in.nextInt();
            if (b<= 1000 && b>= 1){
                cb = b;
            }
            int c = in.nextInt();
            if (c<= 1000 && c>= 1){
                cp = c;
            }
        
        for (int i = 0; i < n; i++) {
            double d = in.nextDouble();
            if (d<= 1000 && d>= 1){
                bi += d;
            }
            double e = in.nextDouble();
            if (c<= 1000 && c>= 1){
                pi += e;
            }
        }
        
        bp = Math.ceil(bi/10);
        pp = Math.ceil(pi/10);
        
        tc = (bp*cb) + (pp*cp);
        
        System.out.println((int)tc);
    }
}
