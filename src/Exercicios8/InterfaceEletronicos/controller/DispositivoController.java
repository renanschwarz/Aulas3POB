package Exercicios8.InterfaceEletronicos.controller;

import Exercicios8.InterfaceEletronicos.model.DispositivoEletronico;

public class DispositivoController {
    private DispositivoEletronico dispositivo;

    public DispositivoController(DispositivoEletronico dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDispositivo() {
        dispositivo.ligar();
    }

    public void desligarDispositivo() {
        dispositivo.desligar();
    }
}
