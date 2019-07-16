/*
 * Moostra resolução da tela!
 */
package com.romulo.cursoemvideo.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rômulo de Carvalho
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tam = tk.getScreenSize();
        System.out.println(tam.width);
        System.out.println(tam.height);
        System.out.println("Resolução " + tam.width + " x " + tam.height);
    }
    
}
