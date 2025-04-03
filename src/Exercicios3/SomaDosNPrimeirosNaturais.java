/* Lista de Exercícios – Estruturas de Repetição em Java
Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total. */

package Exercicios3;

import java.util.Scanner;

public class SomaDosNPrimeirosNaturais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de um número: ");
        int numero = entrada.nextInt();
        int acumulo = 0;

        for (int i = 1; i <= numero; i++) {
            acumulo += i;
        }
        System.out.println("A soma dos " + numero + " primeiros números naturais é: " + acumulo);
        entrada.close();
    }
}
