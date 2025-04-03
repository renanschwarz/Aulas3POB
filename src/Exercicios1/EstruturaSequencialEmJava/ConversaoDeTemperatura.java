package Exercicios1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor que será convertido para Farenheit: ");
        double valor = entrada.nextDouble();

        double farenheit = (valor * 9.0/5.0) + 32;

        System.out.print("O valor em Farenheit é: " + farenheit);

        entrada.close();
    }
}
