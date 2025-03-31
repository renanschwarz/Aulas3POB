/* Exercício 2: Classificação de Idade
Descrição:
Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:
• Menor de idade (menos de 18 anos)
• Adulto (entre 18 e 60 anos)
• Idoso (mais de 60 anos) */

package Exercicio2;

import java.util.Scanner;

public class ClassificaçaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a idade: ");
        int idade = entrada.nextInt();

        if (idade > 60) {
            System.out.print("Classificação: Idoso");
        } else if (idade >= 18) {
            System.out.print("Classificação: Adulto");
        } else {
            System.out.print("Classificação: Menor de idade");
        }
        entrada.close();
    }
}
