package exe22Abstract.sample;

public class Engenheiro extends Pessoa{

    public Engenheiro(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double pagaImposto() {
        return 1000;
    }


}
