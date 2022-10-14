/*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
trocados */
package com.mycompany.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        int a, b, c;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um valor para a variável A: ");
        a = leitor.nextInt();
        System.out.println("Digite outro valor, agora para a variável B: ");
        b = leitor.nextInt();
       
        System.out.println("Os valores são: A = "+ a + " e B = "+ b);  
        
        c = a;
        a = b;
        b = c;
                     
        System.out.println("Os valores,agora invertidos são: A = "+ a + 
                " e B = "+ b);
    }
}
 
