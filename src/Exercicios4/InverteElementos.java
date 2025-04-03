package Exercicios4;

import java.util.Scanner;

public class InverteElementos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}