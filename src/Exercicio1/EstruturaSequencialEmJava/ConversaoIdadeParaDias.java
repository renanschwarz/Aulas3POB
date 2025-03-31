package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class ConversaoIdadeParaDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor da idade: ");
        int idade = entrada.nextInt();

        int idadeEmDias = idade * 365;

        System.out.print("O valor da idade em dias é: " + idadeEmDias);

        entrada.close();
    }
}

