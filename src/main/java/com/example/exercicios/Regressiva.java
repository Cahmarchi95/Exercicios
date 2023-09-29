//Contagem Regressiva
//Peça ao usuário para inserir um número e faça uma contagem regressiva a partir desse número até 1.

package com.example.exercicios;
import java.util.Scanner;

public class Regressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja realizar a contagem regressiva: ");
        int num = scanner.nextInt();

        System.out.println("Contagem regressiva iniciada: ");

        for (int cont = num; cont >= 0; cont--) {
           System.out.println(cont);
        }

        scanner.close();
    }
}
