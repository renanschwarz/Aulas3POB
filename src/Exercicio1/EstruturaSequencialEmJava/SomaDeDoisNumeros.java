package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Entre com o segundo valor: ");
        int valor2 = entrada.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A soma dos valores é: " + soma);
        entrada.close();
    }


}
