package Exercicios8.InterfaceEletronicos.view;

import Exercicios8.InterfaceEletronicos.controller.DispositivoController;
import Exercicios8.InterfaceEletronicos.model.Smartphone;
import Exercicios8.InterfaceEletronicos.model.Televisao;

import java.util.Scanner;

public class DispositivoView {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("Escolha o dispositivo:");
        System.out.println("1 - Smartphone");
        System.out.println("2 - Televisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                menuDispositivo(new Smartphone());
                break;
            case 2:
                menuDispositivo(new Televisao());
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void menuDispositivo(Exercicios8.InterfaceEletronicos.model.DispositivoEletronico dispositivo) {
        DispositivoController controller = new DispositivoController(dispositivo);

        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            controller.ligarDispositivo();
        } else if (escolha == 2) {
            controller.desligarDispositivo();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
