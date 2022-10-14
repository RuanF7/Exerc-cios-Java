/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real 
(R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da 
cotação do dólar e também a quantidade de dólares disponíveis com o usuário*/
package com.mycompany.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        double quantidadeDolar, cotacaoDolar;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos dolares gostaria gostaria de converter em "
                + "reais? ");
        quantidadeDolar = leitor.nextDouble();
        
        System.out.println("Qual a cotação do Dolar hoje? ");
        cotacaoDolar = leitor.nextDouble();
        
        System.out.println("O valor U$"+ quantidadeDolar + " convertido para"
                + " reais é de R$"+ (quantidadeDolar * cotacaoDolar) );
    }
}
