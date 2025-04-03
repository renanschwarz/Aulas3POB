package Exercicios4;

import java.util.Scanner;

public class CalculoMediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;

        System.out.printf("\nMédia: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Resultado: Aprovado ✅");
        } else {
            System.out.println("Resultado: Reprovado ❌");
        }

        entrada.close();
    }
}