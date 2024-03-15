public class Trapezio extends Retangulo implements Forma {

    private double baseMenor;

    private double baseMaior;

    public Trapezio(Cor cor, double largura, double altura, double comprimento, double pesoEspecificoMaterial, double baseMenor, double baseMaior) {
        super(cor, largura, altura, comprimento, pesoEspecificoMaterial);
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    @Override
    public double getArea() {

        return ((getBaseMenor() + getBaseMaior()) * getAltura()) / 2;
    }

    @Override
    public double getPerimetro() {

        double x = (getBaseMaior() - getBaseMenor()) / 2;
        double hi = Math.sqrt(Math.pow(getAltura(),2) + Math.pow(x,2));
        return getBaseMaior() + getBaseMenor() + 2 * hi;
    }

    @Override
    public double getVolume() {


        return getArea() * getComprimento();
    }

    @Override
    public double getPeso() {

        return getPesoEspecificoMaterial() * getVolume();
    }



    @Override
    public double getAltura() {
        return super.getAltura();
    }

    @Override
    public String toString() {
        return String.format("Area: " + getArea()
                + "\nPerimetro: " + getPerimetro()
                + "\nVolume: " + getVolume()
                + "\nPeso: " + getPeso());
    }
}
