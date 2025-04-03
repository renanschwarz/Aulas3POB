package Exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(entrada.nextInt());
        }

        System.out.print("\nDigite um número para verificar quantas vezes ele aparece na lista: ");
        int numeroBuscado = entrada.nextInt();

        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroBuscado + " aparece " + contador + " vezes na lista.");

        entrada.close();
    }
}
