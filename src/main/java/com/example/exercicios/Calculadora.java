//Calculadora Simples: crie uma calculadora que permita aos usuários realizar operações de adição, subtração, multiplicação e divisão.

package com.example.exercicios;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual tipo de operação você deseja realizar: \n1 - soma \n2 - subtração \n3 - multiplicação \n4 - divisão\n ");
        int operacao = scanner.nextInt();
        double resultado = 0;
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        switch (operacao){

            case 1: resultado = (num1 + num2);
            break;
            case 2: resultado = (num1 - num2);
            break;
            case 3: resultado = (num1 * num2);
            break;
            case 4: resultado = (num1 / num2);
            break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        System.out.print("O resultado da operação escolhida foi: " + resultado);

        scanner.close();
    }
}
