/*Faça um algoritmo que receba um número e mostre uma mensagem caso este número 
seja maior que 10*/

package com.mycompany.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um número: ");
        num = leitor.nextInt();
        
        if (num > 10) {
        
            System.out.println("Esse número é maior que 10!");
        }
        else{
        }
    }
}
