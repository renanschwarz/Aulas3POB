package Exercicios4;

import java.util.Scanner;

public class ContagemNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 8;
        int[] numeros = new int[TAMANHO];
        int contadorPares = 0;

        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < TAMANHO; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\nQuantidade de números pares no array: " + contadorPares);

        entrada.close();
    }
}
