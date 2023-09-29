//Verificar Palíndromo
//Peça ao usuário para inserir uma palavra e determine se é um palíndromo (se pode ser lida da mesma forma da esquerda para a direita e vice-versa).

package com.example.exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra que você deseja verificar se é um palíndromo: ");
        String palavra = scanner.next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("Original: " + palavra);
        System.out.println("Invertido: " + palavraInvertida);

        scanner.close();

        if (palavra.equals(palavraInvertida))
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");

    }


    }
