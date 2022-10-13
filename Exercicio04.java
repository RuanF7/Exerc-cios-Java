/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
o salário fixo e salário no final do mês */ 
package com.mycompany.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        String  nomeVendedor;
        double  salarioFixo, totalVendas, salarioTotal; 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = leitor.next();
        System.out.println("Digite o salário fixo mensal do vendedor: ");
        salarioFixo = leitor.nextFloat();
        System.out.println("Agora digite o total de vendas mensal do vendedor"
                + ": ");
        totalVendas = leitor.nextFloat();
        
        salarioTotal = totalVendas * 0.15 + salarioFixo ;
        
        System.out.println("O vendedor: "+ nomeVendedor + " que possuí um "
                + " salário fixo de "+ salarioFixo + " receberá um total de "
                + salarioTotal + " somando a sua comissão de vendas do mês!");

    }
}
