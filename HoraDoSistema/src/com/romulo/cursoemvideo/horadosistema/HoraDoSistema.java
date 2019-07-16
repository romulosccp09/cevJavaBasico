/*
 * Programa que mostra a hora do Sistema!
 */
package com.romulo.cursoemvideo.horadosistema;

import java.util.Date;

/**
 *
 * @author Rômulo de Carvalho
 */
public class HoraDoSistema {

        public static void main(String[] args) {
            Date relogio = new Date();
            System.out.println("A hora do sistema é: ");
            System.out.println(relogio.toString());
    }
    
}
