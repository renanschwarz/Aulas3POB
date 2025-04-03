/* Exercício 5: Conversão de Notas para Conceito
Descrição:
Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case.
Tabela de Conceitos:
• 9 a 10 → A
• 7 a 8 → B
• 5 a 6 → C
• 3 a 4 → D
• 0 a 2 → E
Requisitos:
• Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.". */

package Exercicios2;

import java.util.Scanner;

public class NotasParaConceito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de uma nota de 0 a 10: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 0, 1, 2:
                System.out.print("Conceito: E");
                break;
            case 3, 4:
                System.out.print("Conceito: D");
                break;
            case 5, 6:
                System.out.print("Conceito: C");
                break;
            case 7, 8:
                System.out.print("Conceito: B");
                break;
            case 9, 10:
                System.out.print("Conceito: A");
                break;
            default:
                System.out.print("Nota inválida.");
                break;
        }
        entrada.close();
    }

}
