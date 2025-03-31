/* Exercício 4: Verificação de Ano Bissexto

Descrição:
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
utilizando if-else.
Critérios para ser bissexto:
• Deve ser divisível por 4.
• Se for divisível por 100, deve também ser divisível por 400. */

package Exercicio2;

import java.util.Scanner;

public class VerificaçaoAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor de algum ano: ");
        int ano = entrada.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.print("O ano é bissexto.");
        } else {
            System.out.print("O ano não é bissexto.");
        }
        entrada.close();
    }
}
