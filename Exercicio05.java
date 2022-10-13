/*Escreva um algoritmo que leia o nome de um aluno e as notas das três 
provas que ele obteve no semestre.No finalinformar o nome do aluno e a sua 
média (aritmética); */ 
package com.mycompany.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        String nomeAluno;
        float nota1, nota2, nota3, mediaNotas;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do(a) aluno(a): ");
        nomeAluno = leitor.next();
        System.out.println("Digite a primeira nota do(a) aluno(a): ");
        nota1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota do(a) aluno(a): ");
        nota2 = leitor.nextFloat();
        System.out.println("Digite a terceira nota do(a) aluno(a): ");
        nota3 = leitor.nextFloat();
        
        mediaNotas = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média do(a) aluno(a) "+ nomeAluno + " é: "+ mediaNotas);
        
    }
}
