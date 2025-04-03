/* Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração. */

package Exercicios3;

import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de um número inteiro: ");
        int numero = entrada.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
            i++;
        }
        entrada.close();
    }
}

