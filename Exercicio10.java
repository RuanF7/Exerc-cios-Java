/* A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem 
juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das
prestações */

package com.mycompany.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        float valorCompra;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o valor da compra? ");
        valorCompra = leitor.nextFloat();
        
        System.out.println("A compra será parcelada em 5 prestações de R$" 
        + valorCompra / 5);
    }
}
