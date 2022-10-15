/*Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 
5.1 a 6.9) */

package com.mycompany.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nomeAluno;
        float nota1, nota2, nota3, media;
        
        System.out.println("Digite o nome do(a) aluno(a): ");
        nomeAluno = leitor.next();
        System.out.println("Digite a 1ª nota: ");
        nota1 = leitor.nextFloat();
        System.out.println("Digite a 2ª nota: ");
        nota2 = leitor.nextFloat();
        System.out.println("Digite a 3ª nota");
        nota3 = leitor.nextFloat();
     
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7){
            System.out.println(nomeAluno + " Está aprovado! Média: "+ media);
        } else if (media <= 5){
            System.out.println(nomeAluno + " Está reprovado! Média: " + media);
        } else {
            System.out.println(nomeAluno + " Está de recuperação! Média: "
                    + media);
        }
        
    }
}
