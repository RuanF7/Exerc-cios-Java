/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com
rendimento após um mês. Considere fixo o juro da poupança em 0,07% a. m*/
package com.mycompany.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
                                 
        Scanner leitor = new Scanner(System.in);
        
        double valorDepositado;
                       
        System.out.println("Digite o valor a ser depositado: ");
        valorDepositado = leitor.nextDouble();
        
                
        System.out.println("Após um mês de rendimentos na poupança o valor "
                + "de: R$"+ valorDepositado +" agora é de: R$" 
                + (valorDepositado * 0.07 + valorDepositado));
    }
}
