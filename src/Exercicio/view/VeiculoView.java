package Exercicio.view;

import Exercicio.controller.VeiculoController;
import Exercicio.model.*;

import java.util.Scanner;

public class VeiculoView {
    private VeiculoController controller;
    private Scanner scanner;

    public VeiculoView(VeiculoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    listarVeiculos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    private void cadastrarVeiculo() {
        System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.print("Qtd de portas: ");
                int portas = scanner.nextInt();
                controller.adicionarVeiculo(new Carro(modelo, placa, ano, portas));
                break;
            case 2:
                System.out.print("Cilindrada: ");
                int cilindrada = scanner.nextInt();
                controller.adicionarVeiculo(new Moto(modelo, placa, ano, cilindrada));
                break;
            case 3:
                System.out.print("Capacidade de carga (toneladas): ");
                double carga = scanner.nextDouble();
                controller.adicionarVeiculo(new Caminhao(modelo, placa, ano, carga));
                break;
            default:
                System.out.println("Tipo inválido!");
        }
    }

    private void listarVeiculos() {
        System.out.println("\n=== Veículos Cadastrados ===");
        for (Veiculo v : controller.listarVeiculos()) {
            v.exibirDados();
        }
    }
}

