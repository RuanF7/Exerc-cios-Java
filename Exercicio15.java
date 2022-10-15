/*Faça um algoritmo que receba um número e diga se este número está no intervalo
entre 100 e 200*/

package com.mycompany.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um número: ");
        num = leitor.nextInt();
        
        if (num >= 100 && num <= 200){
            System.out.println("O número está no intervalo entre 100 e 200!");
        }
        else{
            System.out.println("O número não está no intervalo entre 100 e "
                    + "200");
        }
    }
}
