/* Escreva um algoritmo que leia o nome e o sexo de 6 pessoas e informe o nome 
e se ela é homem ou mulher. No final informe total de homens e de mulheres*/

package com.mycompany.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        String nome, sexo;
        int m = 0, f = 0;        
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < 6; i++){
            
        System.out.println("Digite o nome da pessoa: ");
        nome = leitor.next();
        System.out.println("Digite o sexo da pessoa(M/F): ");
        sexo = leitor.next();
            if(sexo.equals ("M")){
                m = m + 1;
            } else if(sexo.equals ("F")){
                f = f + 1;
            }
        }
        System.out.println("Tivemos um total de "+ m +" Homens e "+ f +
                " mulheres");
    }
}
