// Maior de idade, ou menor de idade.
package com.romulo.cursoemvideo.maioridade;

import java.util.Calendar;
import java.util.Scanner;

public class MaiorIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //tirar dados do teclado.
        
        Calendar cal = Calendar.getInstance(); // instanciando ano atual do sistema.
        
        int anoAtual = cal.get(Calendar.YEAR); // variável para armazenar ano atual.
        System.out.println("Digite o ano que voc"
                + "ê nasceu: ");
        int anoNasc = teclado.nextInt(); // Recebendo ano do Nascimento.
        
        int idade = anoAtual - anoNasc; // calculo de idade.
        
        if(idade >= 18){ // condição.
            System.out.println("Você tem " + idade +
                    " anos, você é maior de idade!");
        } else{
            System.out.println("Você tem " + idade +
                    " anos, você é menor de idade!");
        }
        
    }
    
}
