import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        Scanner inserir = new Scanner(System.in);

        System.out.print("Digite o número de figuras: ");
        int quantidade = inserir.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("O que deseja criar?\n[C] Circulo\n[R] Retangulo\n[T] Trapezio");
            char opcao = inserir.next().charAt(0);

            if (opcao == 'R') {
                System.out.print("Cor: ");
                Cor cor = Cor.valueOf(inserir.next());
                System.out.print("Largura: ");
                double largura = inserir.nextDouble();
                System.out.print("Largura: ");
                double altura = inserir.nextDouble();
                System.out.print("Largura: ");
                double comprimento = inserir.nextDouble();
                System.out.print("Largura: ");
                double pesoEspecificoMaterial = inserir.nextDouble();
                formas.add(new Retangulo(cor, largura, altura, comprimento, pesoEspecificoMaterial));

            } else if (opcao == 'C') {

                System.out.print("Cor: ");
                Cor cor = Cor.valueOf(inserir.next());
                System.out.print("Largura: ");
                double largura = inserir.nextDouble();
                System.out.print("Largura: ");
                double altura = inserir.nextDouble();
                System.out.print("Largura: ");
                double comprimento = inserir.nextDouble();
                System.out.print("Largura: ");
                double pesoEspecificoMaterial = inserir.nextDouble();
               // formas.add(new Circulo(cor, largura, altura, comprimento, pesoEspecificoMaterial));

            } else if (opcao == 'T') {

                System.out.print("Cor: ");
                Cor cor = Cor.valueOf(inserir.next());
                System.out.print("Largura: ");
                double largura = inserir.nextDouble();
                System.out.print("Largura: ");
                double altura = inserir.nextDouble();
                System.out.print("Largura: ");
                double comprimento = inserir.nextDouble();
                System.out.print("Largura: ");
                double baseMaior = inserir.nextDouble();
                System.out.print("Largura: ");
                double baseMenor = inserir.nextDouble();
                System.out.print("Largura: ");
                double pesoEspecificoMaterial = inserir.nextDouble();
                formas.add(new Trapezio(cor, largura, altura, comprimento, pesoEspecificoMaterial, baseMaior, baseMenor));
            }


            for (Forma forma : formas) {
                System.out.println(forma);
            }
        }
    }

}