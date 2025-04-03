package Exercicios1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor do salário bruto: ");
        double salarioBruto = entrada.nextDouble();

        System.out.print("Entre com o valor do desconto do INSS: ");
        double desconto = entrada.nextDouble();

        double salarioLiquido = salarioBruto - desconto;

        System.out.print("O valor do salário líquido é: " + salarioLiquido);
        entrada.close();
    }
}
