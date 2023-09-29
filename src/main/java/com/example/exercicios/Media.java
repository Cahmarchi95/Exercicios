//6: Média de Números
//Peça ao usuário para inserir uma série de números e calcule a média deles.

package com.example.exercicios;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        double num4 = scanner.nextDouble();

        System.out.print("Digite o quinto número: ");
        double num5 = scanner.nextDouble();

        double soma = num1 + num2 + num3 + num4 + num5 ;

        double media = soma / 5 ;


        System.out.println("A média dos números digitados é: " +  String.format("%.2f", media));

        scanner.close();
    }
}
