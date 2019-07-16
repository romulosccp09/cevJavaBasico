/*
 * Aula de Tipos primitivos Curso em vídeo java básico
 */
package com.romulo.cursoemvideo.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Rômulo de Carvalho
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "Rômulo";
        float nota = 8.5f;
        System.out.println("Sua nota é: " + nota);
        System.out.printf(" %s sua nota é %.2f \n", nome, nota); // print formatado.
        System.out.format("%s sua nota vale -> %.2f \n", nome, nota);
        System.out.println("Digite um nome:");
        String nome2 = teclado.nextLine();
        System.out.println("Digite uma nota: ");
        float nota2 = teclado.nextFloat();
        System.out.printf("%s sua nota vale -> %.2f \n", nome, nota2);
    }
    
}
