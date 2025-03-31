package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class PerimetroEAreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor da base do retângulo: ");
        double base = entrada.nextDouble();
        System.out.print("Entre com o valor da altura do retângulo: ");
        double altura = entrada.nextDouble();

        double perimetro = (base + altura) * 2;
        double area = base * altura;

        System.out.print("O perímetro do retângulo é: " + perimetro + " e a área é " + area);
        entrada.close();
    }
}
