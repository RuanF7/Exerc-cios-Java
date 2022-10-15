/*Leia 8 números e ao final informar quantos número(s) est(á)ão no intervalo 
entre 1 (inclusive) e 10(inclusive) */

package com.mycompany.exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int num, numIntervalo = 0;
        
        for(int i = 1; i <= 8; ++i){
        System.out.println("Digite um número: ");
        num = leitor.nextInt();
            if(num >= 1 && num <= 10){
                numIntervalo = numIntervalo + 1;
            } else {
            
            }
        }
        
        System.out.println("Tivemos "+ numIntervalo +" números no intervalo "
                + "entre 1 e 10!");
    }
}
