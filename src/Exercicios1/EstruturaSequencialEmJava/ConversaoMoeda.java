package Exercicios1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor em reais: ");
        double reais = entrada.nextDouble();

        double valorEmDolar = reais * 5.71;

        System.out.print("O valor convertido em dólares é : " + valorEmDolar);
        entrada.close();
    }
}

