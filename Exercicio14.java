/*Escreva um algoritmo que leia dois valores inteiro distintos e informe qual 
é o maior */

package com.mycompany.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o 1º valor: ");
        a = leitor.nextInt();

        System.out.println("Digite o 2º valor: ");
        b = leitor.nextInt();

        if (a > b){
            System.out.println("O maior valor é: "+ a);
        }
        else if (a < b){
            System.out.println("O maior valor é: "+ b);
        }
        else{
            System.out.println("Os valores são iguais!" );
        }
    }
}
