/*
 * Programa que ler o idioma do sistema e o país!
 */
package com.romulo.cursoemvideo.idiomasistema;

import java.util.Locale;

/**
 *
 * @author Rômulo de Carvalho
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayCountry());
        System.out.println(idioma.getCountry());
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }
    
}
