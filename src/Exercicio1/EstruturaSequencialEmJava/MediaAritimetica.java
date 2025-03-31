package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor 1: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Entre com o valor 2: ");
        double valor2 = entrada.nextDouble();
        System.out.print("Entre com o valor 3: ");
        double valor3 = entrada.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3.0;

        System.out.print("A media dos 3 valores é: " + media);

        entrada.close();
    }
}
