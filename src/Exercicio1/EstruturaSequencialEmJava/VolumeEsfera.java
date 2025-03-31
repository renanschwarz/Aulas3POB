package Exercicio1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor do raio da esfera: ");
        double raio = entrada.nextDouble();

        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);

        System.out.print("O volume da esfera é: " + volume);
        entrada.close();
    }
}
