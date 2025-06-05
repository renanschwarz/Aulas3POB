package Exercicios8.InterfaceFormasGeometricas.view;

import Exercicios8.InterfaceFormasGeometricas.controller.FormaController;
import Exercicios8.InterfaceFormasGeometricas.model.Circulo;
import Exercicios8.InterfaceFormasGeometricas.model.Retangulo;

import java.util.Scanner;

public class FormaView {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("Escolha a forma geométrica:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Círculo");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                processarRetangulo();
                break;
            case 2:
                processarCirculo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void processarRetangulo() {
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        FormaController controller = new FormaController(retangulo);

        System.out.println("Área: " + controller.obterArea());
        System.out.println("Perímetro: " + controller.obterPerimetro());
    }

    private void processarCirculo() {
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);
        FormaController controller = new FormaController(circulo);

        System.out.println("Área: " + controller.obterArea());
        System.out.println("Perímetro: " + controller.obterPerimetro());
    }
}
