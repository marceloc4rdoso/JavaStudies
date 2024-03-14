package exe23;

public class SCross implements Motor, Veiculo{
    private String marca;
    private int anoModelo;

    public SCross(String marca, int anoModelo) {
        this.marca = marca;
        this.anoModelo = anoModelo;
    }

    @Override
    public int getRPM() {
        return 1800;
    }

    @Override
    public double getPotecia() {
        return 200;
    }

    @Override
    public String tipo() {
        return "Veículo Urbano";
    }

    @Override
    public double peso() {
        return 1300;
    }

    @Override
    public String toString() {
        return "SCross{" +
                "marca='" + marca + '\'' +
                ", anoModelo=" + anoModelo +
                '}';
    }
}
