package br.com.aplicacao.modelos;

public class Compra implements Comparable <Compra> {

    private String descricaoDaCompra;
    private double valorDaCompra;

    public Compra(String descricaoDaCompra, double valorDaCompra) {
        this.descricaoDaCompra = descricaoDaCompra;
        this.valorDaCompra = valorDaCompra;
    }

    public String getDescricaoDaCompra() {
        return descricaoDaCompra;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }


    @Override
    public String toString() {
        return this.descricaoDaCompra + " - R$" + this.valorDaCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valorDaCompra, outraCompra.getValorDaCompra());
    }
}
