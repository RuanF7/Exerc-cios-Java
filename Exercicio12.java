/* O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o
percentual do distribuidor e dos impostos aplicados (primeiro os impostos são 
aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
custo ao consumidor do mesmo*/

package com.mycompany.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float custoFabrica, custoConsumidor,custoMaisImposto;
        
        System.out.println("Qual o custo de fábrica do veículo? ");
        custoFabrica = leitor.nextFloat();
        
        custoMaisImposto = custoFabrica * 45 / 100 + custoFabrica;
        
        custoConsumidor = custoMaisImposto * 28 / 100 + custoMaisImposto;
        
        System.out.println("O custo do veículo é de R$"+ custoConsumidor);
    }
}
