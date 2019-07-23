/*
 * Oerador Ternário
 */
package com.romulo.cursoemvideo.operadorternario;

/**
 *
 * @author Rômulo de Carvalho
 * @email romulo514@hotmail.com
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2, r, r2, r3;
        
        n1 = 15;
        n2 = 12;
        
        r = n1 > n2 ? 0 : 1;
        r2 = n1 > n2 ? n1 : n2;
        r3 = n1 > n2 ? n1 + n2 : n1-n2;
        
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
