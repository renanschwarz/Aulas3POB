/* Exercício 5: Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados. */

package Exercicios3;

import java.util.Scanner;

public class IntervaloDeNumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor (inteiro e positivo) do primeiro número: ");
        int inicio = entrada.nextInt();
        System.out.print("Entre com o valor (inteiro e positivo) do segundo número: ");
        int fim = entrada.nextInt();

        System.out.println("Números primos no intervalo:");

        for (int num = inicio; num <= fim; num++) {
            if (num < 2) continue;

            boolean ehPrimo = true;

            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(num + " ");
            }
        }
        entrada.close();
    }
}
