package com.romulo.cursoemvideo.operadoresaritmeticos;

/**
 *
 * @author Rômulo de Carvalho
 * @email romulo514@hotmail.com
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 5;
        float media = (3 + 5) / 2;
        
        System.out.println("A média entre " + numero1 + " e " + numero2
                + "vale -> " + media + "!");
        
        float n = 25f;
        float n2 = (float) Math.sqrt(n); // para usar sqrt temos que usar type cast pis só aceita double.
        System.out.println("A raiz de " + n + " é " + n2 + "!");
        
        float n3 = (float) Math.pow(n, 2);
        
        System.out.println("O valor de " + n + "² vale -> " + n3 + "!");

        //Arredondamentos
        float b = 7.5f;
        float ar1 = (float) Math.floor(b); // floor arredonda para baixo.
        
        float ar2 = (float) Math.ceil(b); // ceil arredonda o valor pra cima.
        
        float c = 7.8f;
        float d = 8.2f;
        
        float ar3 = Math.round(d); // arredondamento aritmetico.
        float ar4 = Math.round(c);
        
        

        // valor absoluto
        float q = -10;
        float abs1 = Math.abs(q);
        
        System.out.println("Valores arrendodados: " + b + " " + ar1 );
        System.out.println("Valores arrendodados: " + b + " " + ar2 );
        System.out.println("Valores arrendodados: " + c + " " + ar3 );
        System.out.println("Valores arrendodados: " + d + " " + ar4 );
        System.out.println("Valores arrendodados: " + q + " " + abs1 );
        
        //Numero aleatorio, nomeroa entre 0 - 1
        
        double ale =  Math.random();
        System.out.println(ale);
        
        // para dar resultado de um numero a leatorio nesse exemplo 1 - 10.
        double ale1 = Math.random();
        int ac = (int) (1 + ale1 * (10-1));
        float af = Math.round(ale);
        System.out.println(ale);
        System.out.println(ac);
    }   
    
    
    
}
