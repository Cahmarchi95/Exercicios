//Tabuada
//Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10

package com.example.exercicios;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabuada: ");
        int num = scanner.nextInt();

        for (int cont = 0; cont <= 10; cont++) {
            int resultado = num * cont;
            System.out.println(num + "x" + cont + "=" + resultado);
        }

        scanner.close();

    }
}