package Exercicios8.InterfacePagamentos.controller;

import Exercicios8.InterfacePagamentos.model.Pagamento;

public class PagamentoController {
    private Pagamento metodoPagamento;

    public PagamentoController(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void processarPagamento(double valor) {
        metodoPagamento.realizarPagamento(valor);
    }
}