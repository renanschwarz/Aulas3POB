package Exercicios1.EstruturaSequencialEmJava;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de X da primeira coordenada: ");
        double x1 = entrada.nextDouble();
        System.out.print("Entre com o valor de Y da primeira coordenada: ");
        double y1 = entrada.nextDouble();

        System.out.print("Entre com o valor de X da segunda coordenada: ");
        double x2 = entrada.nextDouble();
        System.out.print("Entre com o valor de Y da segunda coordenada: ");
        double y2 = entrada.nextDouble();

        double distancia =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("A distância entre os pontos é: " + distancia);

        entrada.close();
    }
}
