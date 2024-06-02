package br.com.capybird.model;

public class Gasto implements Comparable<Gasto>{

    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Gasto{" + '\'' +
                "Descricao: '" + descricao + " R$ " + valor +'}';
    }


    public void extrato(){
        //
    }

    @Override
    public int compareTo(Gasto outroGasto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroGasto.valor));
    }
}
