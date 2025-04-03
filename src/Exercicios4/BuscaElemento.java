package Exercicios4;

import java.util.Scanner;

public class BuscaElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int[] numeros = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = entrada.nextInt();
        }

        System.out.print("\nDigite um número para buscar no array: ");
        int numeroBuscado = entrada.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < TAMANHO; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        entrada.close();
    }
}
