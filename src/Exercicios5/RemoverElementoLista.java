package Exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverElementoLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes para adicionar à lista:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(entrada.nextLine());
        }

        System.out.print("\nDigite um nome para remover da lista: ");
        String nomeRemover = entrada.nextLine();

        if (nomes.remove(nomeRemover)) {
            System.out.println("\nO nome \"" + nomeRemover + "\" foi removido com sucesso.");
        } else {
            System.out.println("\nO nome \"" + nomeRemover + "\" não foi encontrado na lista.");
        }

        System.out.println("\nLista de nomes atualizada:");
        for (String nome : nomes) {
            System.out.println("- " + nome);
        }

        entrada.close();
    }
}
