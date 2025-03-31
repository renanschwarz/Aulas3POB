/* Lista de Exercícios – Estruturas Condicionais em Java
Exercício 1: Verificação de Número Par ou Ímpar
Descrição:
Crie um programa que solicite um número inteiro ao usuário e determine se ele é
par ou ímpar, utilizando a estrutura if-else.
Requisitos:
• O programa deve ler um número inteiro.
• Se o número for divisível por 2, exibir "O número é par."
• Caso contrário, exibir "O número é ímpar.". */

package Exercicio2;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
        entrada.close();
    }
}
