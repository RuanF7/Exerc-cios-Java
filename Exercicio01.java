/*Faça um algoritmo que receba dois números e exiba o resultado da soma */ 
package com.mycompany.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        int a, b;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        a = leitor.nextInt();
        System.out.println("Agora digite outro número: ");
        b = leitor.nextInt();
        
        System.out.println("A soma de " + a + " + " + b +" = " + (a + b));
        
    }
}
