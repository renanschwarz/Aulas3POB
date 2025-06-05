package Exercicios8.InterfacePagamentos.view;

import Exercicios8.InterfacePagamentos.controller.PagamentoController;
import Exercicios8.InterfacePagamentos.model.CartaoCredito;
import Exercicios8.InterfacePagamentos.model.BoletoBancario;

public class PagamentoView {
    public void exibirPagamentos() {
        PagamentoController cartaoController = new PagamentoController(new CartaoCredito());
        PagamentoController boletoController = new PagamentoController(new BoletoBancario());

        cartaoController.processarPagamento(100.00);
        boletoController.processarPagamento(200.50);
    }
}
