import java.util.Scanner;

public class Circulo implements Forma {
    private  double raio;
    private Cor cor;
    private double comprimento;
    private double pesoEspecificoMaterial;

    Scanner inserir = new Scanner(System.in);

    public Circulo() {
        this.raio = raio;
        this.cor = cor;
        this.comprimento = comprimento;
        this.pesoEspecificoMaterial = pesoEspecificoMaterial;
    }

    public void insereDados(){
        System.out.print("Insira o raio: ");
        raio = inserir.nextDouble();
        System.out.print("Insira a cor: ");
        cor = Cor.valueOf(inserir.next());
        System.out.print("Insira comprimento: ");
        comprimento = inserir.nextDouble();
        System.out.print("Insira o Peso Especifico do Materia: ");
        pesoEspecificoMaterial = inserir.nextDouble();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getPeso() {
        return 0;
    }

    @Override
    public String toString() {

        return "Circulo{" +
                "raio=" + raio +
                ", cor=" + cor +
                ", comprimento=" + comprimento +
                ", pesoEspecificoMaterial=" + pesoEspecificoMaterial +
                '}';
    }
}
