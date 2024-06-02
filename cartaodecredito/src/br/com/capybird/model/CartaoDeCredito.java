package br.com.capybird.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito extends Cartao{

    private double saldo;
    private List <Gasto> gastos;

    public CartaoDeCredito(double limite, double saldo, List gastos) {
        super(limite);
        this.saldo = saldo;
        this.gastos = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    @Override
    public boolean lancamentosDeGastos(Gasto gasto) {
        this.gastos.add(gasto);
        return super.lancamentosDeGastos(gasto);
    }
}
