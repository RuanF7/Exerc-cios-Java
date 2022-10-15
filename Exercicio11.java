/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
percentual informado pelo usuário */

package com.mycompany.exercicio11;

import java.util.Scanner;
        
public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float precoCusto, percentual;
        
        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = leitor.nextFloat();
        
        System.out.println("Digite o percentual de acrécimo ao preço do "
                + "produto: ");
        percentual = leitor.nextFloat();
        
        System.out.println("O valor de venda do produto será de: R$"+ 
                (precoCusto * percentual / 100 + precoCusto));
 
       }  
    
}
