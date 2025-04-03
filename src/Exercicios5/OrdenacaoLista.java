package Exercicios5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números inteiros (digite -1 para parar):");
        while (true) {
            System.out.print("Número: ");
            int numero = entrada.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("\nLista ordenada em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        entrada.close();
    }
}
