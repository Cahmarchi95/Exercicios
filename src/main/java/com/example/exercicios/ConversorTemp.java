//Conversor de Temperatura
//Crie um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, dependendo da escolha do usuário.

package com.example.exercicios;
import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual tipo de conversão você deseja realizar: \n1-Celsius para Fahrenheit  \n2-Fahrenheit para Celsius\n");
        int conversao = scanner.nextInt();
        System.out.print("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        if(conversao == 1){
            double F = (temp * 9/5) + 32 ;
        System.out.print("A temperatura digitada " + temp + " ºC" + " corresponde a " + F + "ºF");
        }else if(conversao == 2){
            double C = (temp - 32) * 5/9 ;
            System.out.print("A temperatura digitada " + temp + " ºF" + " corresponde a " + C + "ºC");
        }



        scanner.close();
    }
}
