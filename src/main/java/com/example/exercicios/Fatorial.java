//Fatorial de um Número
//Peça ao usuário para inserir um número e calcule o fatorial desse número.

package com.example.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber o fatorial: ");
        int num = scanner.nextInt();
        long fatorial = 1;

        for (int cont = 1; cont <= num; cont++) {
            fatorial = fatorial * cont;
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);
        scanner.close();
    }
}
