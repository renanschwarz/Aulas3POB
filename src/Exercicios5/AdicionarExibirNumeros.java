package Exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarExibirNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números para adicionar à lista. Digite -1 para parar.");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero == -1) {
                break;
            }

            numeros.add(numero);
        }

        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        entrada.close();
    }
}
