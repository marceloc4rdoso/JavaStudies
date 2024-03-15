public class Retangulo implements Forma {

    private Cor cor;

    private double largura;
    private double altura;
    private double comprimento;
    private double pesoEspecificoMaterial;

    public Retangulo(Cor cor, double largura, double altura, double comprimento, double pesoEspecificoMaterial) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.pesoEspecificoMaterial = pesoEspecificoMaterial;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPesoEspecificoMaterial() {
        return pesoEspecificoMaterial;
    }

    public void setPesoEspecificoMaterial(double pesoEspecificoMaterial) {
        this.pesoEspecificoMaterial = pesoEspecificoMaterial;
    }

    @Override
    public double getArea() {
        return getLargura() * getAltura();
    }

    @Override
    public double getPerimetro() {

        return 2 * getLargura() + 2 * getAltura();
    }

    @Override
    public double getVolume() {

        return getArea() * getComprimento();
    }

    @Override
    public double getPeso() {

        return getVolume() * getPesoEspecificoMaterial();
    }

    public double getAltura(){
        return 0;
    }

    public double getLargura(){
        return 0;
    }

    public String toString(){
        return String.format("TEste"+ getArea() + getPerimetro() + getVolume());
    }
}
