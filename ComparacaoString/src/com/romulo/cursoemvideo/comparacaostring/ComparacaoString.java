/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romulo.cursoemvideo.comparacaostring;

/**
 *
 * @author rd-sccp
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Rômulo";
        String nome2 = "Rômulo";
        String nome3 = new String("Rômulo");
        
        String res = nome == nome2 ? "verdadeiro" : "falso";  // verdadeiro
        String res2 = nome == nome3 ? "verdadeiro" : "falso"; // falso duas estruturas de objeto diferentes
        String res3 = nome.equals(nome3) ? "verdadeiro" : "falso"; // verdadeiro a função .equals verifica o conteudo dentro dos objetos
        
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
    
}
