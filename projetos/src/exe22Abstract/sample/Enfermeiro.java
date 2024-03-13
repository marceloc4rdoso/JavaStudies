package exe22Abstract.sample;

public class Enfermeiro extends Pessoa{
    public Enfermeiro(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double pagaImposto() {
        return 2000;
    }
}
