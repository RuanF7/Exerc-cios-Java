/*Faça um algoritmo que receba dois números e ao final mostre a soma,subtração, 
multiplicação e divisão dos dois números lidos */ 
package com.mycompany.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        int a, b;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        a = leitor.nextInt();
        System.out.println("Agora digite outro número: ");
        b = leitor.nextInt();
        
        System.out.println("A soma de " + a + " + " + b +" = " + (a + b));
        System.out.println("A subtração de " + a + " - " + b +" = " + (a - b));
        System.out.println("A multiplição de " + a + " x " + b +" = " + (a * b));
        System.out.println("A divisão de "  + a + " ÷ " + b +" = " + (a / b));
        
    }
}
