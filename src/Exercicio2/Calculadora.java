/* Exercício 3: Calculadora Simples com switch-case
Descrição:
Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.
Requisitos:
• O programa deve solicitar dois números e a operação desejada.
• Deve usar switch-case para executar a operação correspondente.
• Caso a operação não seja válida, exibir "Operação inválida.".
• Se a operação for divisão (/), verificar se o segundo número é zero antes de
calcular. */

package Exercicio2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Entre com o segundo valor: ");
        double valor2 = entrada.nextDouble();

        System.out.print("Qual operação deseja realizar? [1]Somar [2]Subtrair [3]Multiplicar [4]Dividir ");
        int resposta = entrada.nextInt();

        switch (resposta) {
            case 1:
                double soma = valor1 + valor2;
                System.out.println(soma);
                break;
            case 2:
                double subtracao = valor1 - valor2;
                System.out.println(subtracao);
                break;
            case 3:
                double multiplicacao = valor1 * valor2;
                System.out.println(multiplicacao);
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Operação impossível!");
                    break;
                }
                double divisao = valor1 / valor2;
                System.out.println(divisao);
                break;
            default:
                System.out.println("Operação inválida.");
        }
        entrada.close();
    }
}
