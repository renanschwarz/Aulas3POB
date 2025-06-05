package Exercicios8.InterfaceFormasGeometricas.controller;

import Exercicios8.InterfaceFormasGeometricas.model.FormaGeometrica;

public class FormaController {
    private FormaGeometrica forma;

    public FormaController(FormaGeometrica forma) {
        this.forma = forma;
    }

    public double obterArea() {
        return forma.calcularArea();
    }

    public double obterPerimetro() {
        return forma.calcularPerimetro();
    }
}