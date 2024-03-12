package ex20Pofiform;

public class Colaborador {
    private String nome;
    private int hora;
    private double valorPorHora;

    public Colaborador(String nome, int hora, double valorPorHora) {
        setNome(nome);
        setHora(hora);
        setValorPorHora(valorPorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return getHora() * getValorPorHora();
    }
}
