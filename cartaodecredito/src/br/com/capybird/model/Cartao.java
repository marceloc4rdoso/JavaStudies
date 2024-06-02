package br.com.capybird.model;

import java.util.Scanner;

public class Cartao {

    private String bandeira = "Visa";
    private String operadora = "C6 Bank";
    private String numero = "4567 8910 1112 1314";
    private String titular = "Marcelo C Oliveira";
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public boolean lancamentosDeGastos(Gasto gasto){
        if (this.limite > gasto.getValor()){
            this.limite -= gasto.getValor();
            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS:\n");
/*
            for (Gasto g cartao.getCompras()) {
                System.out.println(g.getDescricao() + " - " + g.getValor());
            }
            System.out.println("\n***********************");

            System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
            return false;

 */
        }
        return true;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimite() {
        System.out.print("Limite inicial: " + getLimite());
        return limite;
    }

    public void setLimite(double limite) {
        System.out.print("Insira seu limite: ");
        Scanner inserir = new Scanner(System.in);
        limite = inserir.nextDouble();
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "bandeira='" + bandeira + '\'' +
                ", operadora='" + operadora + '\'' +
                ", numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", limite=" + limite +
                '}';
    }
}
