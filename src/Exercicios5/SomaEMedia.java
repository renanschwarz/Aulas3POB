package Exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite números para adicionar à lista (Digite -1 para encerrar):");
        while (true) {
            System.out.print("Número: ");
            double num = entrada.nextDouble();

            if (num == -1) {
                break;
            }

            numeros.add(num);
        }

        if (!numeros.isEmpty()) {
            for (double numero : numeros) {
                soma += numero;
            }

            double media = soma / numeros.size();

            System.out.println("\nSoma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("\nNenhum número foi inserido.");
        }

        entrada.close();
    }
}
