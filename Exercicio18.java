/* Faça um algoritmo que receba a idade de 7 pessoas e mostre mensagem 
informando “maior de idade” e “menor de idade” para cada pessoa. Considere a 
idade a partir de 18 anos como maior de idade*/

package com.mycompany.exercicio18;

import java.util.Scanner; 

public class Exercicio18 {

    public static void main(String[] args) {
        
        int idade;
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= 7; i++ ){
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
            if(idade >= 18){
                System.out.println("Maior de idade: ");
            }else{
                System.out.println("Menor de idade: ");
            }
        }
    }
}
