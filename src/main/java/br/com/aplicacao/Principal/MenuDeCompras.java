package br.com.aplicacao.Principal;

import br.com.aplicacao.modelos.Compra;
import br.com.aplicacao.modelos.Conta;

import java.util.Collections;
import java.util.Scanner;

public class MenuDeCompras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao TickPay!\n");
        System.out.println("Informe seu nome: " );
        String nome = sc.nextLine();
        System.out.println("Informe o Limite do seu Cartão: ");
        double limite = sc.nextDouble();

        Conta conta = new Conta(nome, limite);

        sc.nextLine();
        int opcao = 0;
        do {


        System.out.println("Informe a descrição da compra: ");
        String descricaoDaCompra = sc.nextLine();

        System.out.println("Informe o valor da br.com.aplicacao.modelos.Compra: ");
        double valorDaCompra = sc.nextDouble();

        Compra compra = new Compra(descricaoDaCompra, valorDaCompra);

            boolean compraRealizada = conta.realizaCompra(compra);
            if (compraRealizada) {
                System.out.println("br.com.aplicacao.modelos.Compra Realizada!");
                System.out.println("""
                        Digite:
                        0 - Para Sair
                        1 - Para Continuar
                        """);
                opcao = sc.nextInt();
                sc.nextLine();
            } else{
                System.out.println("Limite Insufuciente!!!");
                break;
            }
        }
        while(opcao != 0);
        Collections.sort(conta.getLista());
        System.out.println("COMPRAS REALIZADAS: ");
        for (Compra c : conta.getLista()) {
            System.out.println(c);
        }
        System.out.println("Saldo do Cartão: " + conta.getLimite());










     sc.close();
    }
}
