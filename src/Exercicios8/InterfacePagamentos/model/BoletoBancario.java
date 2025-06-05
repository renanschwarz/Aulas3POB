package Exercicios8.InterfacePagamentos.model;

public class BoletoBancario implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancário.");
    }
}
