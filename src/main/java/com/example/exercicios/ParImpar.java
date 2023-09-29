//Verificar Número Par ou Ímpar : Peça ao usuário para inserir um número e determine se é par ou ímpar.

package com.example.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.print("O número digitado é par");
        } else{
            System.out.print("O número digitado é ímpar");
        }



        scanner.close();
    }
}
