package Exercicios1.exemploPOO.controle;
import Exercicios1.exemploPOO.dominio.Produto;

public class ControlaProduto {
    public static void main(String[] args) {
        Produto prod = new Produto(44, "KitKat", 5.0);

        prod.setDescricao("Bis");
        prod.listarProduto();

    }
}
