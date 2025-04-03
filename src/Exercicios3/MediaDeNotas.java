/* Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma. */

package Exercicios3;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a quantidade de alunos da turma: ");
        int quantAlunos = entrada.nextInt();
        double notas = 0.0;

        for (int i = 1; i <= quantAlunos; i++) {
            System.out.print("Entre com a nota do " + i + "° aluno: ");
            notas += entrada.nextDouble();
        }

        double media = notas / quantAlunos;
        System.out.print("A média de notas da turma é: " + media);
        entrada.close();
    }
}
