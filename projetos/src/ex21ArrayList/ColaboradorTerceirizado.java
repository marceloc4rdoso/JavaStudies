package ex21ArrayList;

public class ColaboradorTerceirizado extends Colaborador {
    private double custoAdicional;

    public ColaboradorTerceirizado(String nome, int hora, double valorPorHora, double custoAdicional) {
        super(nome, hora, valorPorHora);
        setCustoAdicional(custoAdicional);
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + getCustoAdicional() * 1.1;
    }
}
