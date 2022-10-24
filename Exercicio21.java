/*Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade) 
e informe se está apta ou não para cumprir o serviço militar obrigatório. 
Informe os totais;*/

package com.mycompany.exercicio21;

import java.util.Scanner;


public class Exercicio21 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome, sexo, saúde;
        int idade, apto = 0, naoApto = 0;
        char repetir = 's';
                
         while(repetir == 's' || repetir == 'S'){
             System.out.print("Digite o nome da pessoa: ");
             nome = leitor.next();
             System.out.print("Digite o sexo da pessoa(M/F): ");
             sexo = leitor.next();
             System.out.print("Digite a idade da pessoa: ");
             idade = leitor.nextInt();
             
             if(sexo.equals ("M") && idade >= 18) {
                 apto = apto + 1;
             }else {
                 naoApto = naoApto + 1;
             }
             
            System.out.println("Deseja cadastrar mais alguém? "
                    + "S/N");
            repetir = leitor.next().charAt(0);

        }
         
        System.out.println("O número total de aptos a cumprir o serviço "
                + "militar é de: " + apto);
        System.out.println("O número total de não aptos a cumprir o serviço"
                + "militar é de: "+ naoApto);
    }
}
