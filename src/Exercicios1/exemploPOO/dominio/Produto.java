package Exercicios1.exemploPOO.dominio;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto (int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void listarProduto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
    }
}
