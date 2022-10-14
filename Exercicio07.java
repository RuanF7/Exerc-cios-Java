/*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em
Fahrenheit e C a temperatura emCelsius*/
package com.mycompany.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int F, C;
        
        System.out.println("Qual a temperatura em graus Celsius? ");
        C = leitor.nextInt();
        
        F = (9*C+160) / 5;
        
        System.out.println(+ C +"ºC convertido para Fahrenheit são: "
                + F + "ºF");
    }
}
