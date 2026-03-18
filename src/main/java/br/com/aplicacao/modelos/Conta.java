package br.com.aplicacao.modelos;

import java.util.ArrayList;
import java.util.List;

public class Conta{

    private String nome;
    private double limite;

    public Conta(String nome, double limite) {
        this.nome = nome;
        this.limite = limite;
    }

    private List<Compra> lista = new ArrayList<>();

    public List<Compra> getLista() {
        return lista;
    }

    public double getLimite() {
        return limite;
    }

    public Conta(String nome) {
        this.nome = nome;
    }

    public boolean realizaCompra(Compra compra){
        if(compra.getValorDaCompra() <= limite) {
             limite -= compra.getValorDaCompra();
             lista.add(compra);
            return true;
        }
        else {
            return false;
        }
    }

}
