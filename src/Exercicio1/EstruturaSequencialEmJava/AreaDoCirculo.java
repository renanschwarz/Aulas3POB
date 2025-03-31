package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor do raio do círculo: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

        entrada.close();
    }
}
