package exe022Locadora;

public class Combustivel {

    private String tipoCombustivel;

    //TODO fazer calculos


    public Combustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    Combustivel combustiveis = new Combustivel(tipoCombustivel);

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calculoConsumo(){

        if (tipoCombustivel == "GAS"){

        }
        return 0;
    }


}
