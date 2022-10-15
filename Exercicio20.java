/* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos 
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o 
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado 
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema 
deverá perguntar se deseja continuar calculando desconto até que a resposta 
seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral*/

package com.mycompany.exercicio20;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int anoVeiculo = 0, totalVelhos = 0, totalGeral = 0;
        float valorVeiculo = 0.0f;
        double valorDesconto = 0.0d;
        char repetir = 's';
        
        while(repetir == 's' || repetir == 'S'){
            System.out.println("Digite o ano do veículo: ");
            anoVeiculo = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextInt();
                totalGeral = totalGeral + 1;
                if(anoVeiculo <= 2000){
                    valorDesconto = (valorVeiculo * 12 / 100);
                    totalVelhos = totalVelhos + 1;
                }else {
                    valorDesconto = (valorVeiculo * 7 / 100);
                }
                System.out.println("O valor do desconto é de R$"+ valorDesconto
                        +" e o valor final do veículo é de R$"+(valorVeiculo - 
                                valorDesconto));
                System.out.println("Deseja continuar calculando desconto? "
                        + "S/N");
                repetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros antigos: "+ totalVelhos);
        System.out.println("Total de carros : "+ totalGeral);

        
    }
}
