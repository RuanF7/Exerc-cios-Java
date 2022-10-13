/*Escreva um algoritmo para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorrida pelo automóvel e o 
total de combustível gasto */ 
package com.mycompany.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        float consumoMedio, distanciaTotal, totalCombustivel;
      
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida: ");
        distanciaTotal = leitor.nextFloat();
        System.out.println("Agora digite o total de combústivel gasto: ");
        totalCombustivel = leitor.nextFloat();
        
        consumoMedio = distanciaTotal /  totalCombustivel ;
        
        System.out.println("O consumo médio de combustível do automóvel é de: " 
                + consumoMedio + "KM/L" );
    }
}
