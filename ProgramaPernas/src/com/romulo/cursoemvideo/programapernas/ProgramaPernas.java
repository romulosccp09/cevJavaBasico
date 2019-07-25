package com.romulo.cursoemvideo.programapernas;

import java.util.Scanner;

/**
 *
 * @author rd-sccp
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantidade de pernas:");
        
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a)");
        switch(pernas){
            case 1: tipo = " SACI"; break;
            case 2: tipo = " Bípede"; break;
            case 3: tipo = " Tripé"; break;
            case 4: tipo = " Quadrúpede"; break;
            case 6: tipo = " Aranha"; break;
            case 8: tipo = " Polvo"; break;
            default: tipo = " ET"; 
        }
        System.out.println(tipo + "!");
            
            
    }
    
}
