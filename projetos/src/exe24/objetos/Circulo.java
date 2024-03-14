package exe24.objetos;

import exe24.Forma;

import java.util.Scanner;

public class Circulo implements Forma {

    Scanner scanner = new Scanner(System.in);
    @Override
    public double area() {
        System.out.print("Insira Area: ");
        return scanner.nextDouble();
    }
    @Override
    public double perimetro() {
        System.out.print("Insira Perimetro: ");
        return scanner.nextDouble();
    }
    @Override
    public double volume() {
        System.out.print("Insira Volume: ");
        return scanner.nextDouble();
    }

    @Override
    public double peso() {
        System.out.print("Insira Peso: ");
        return scanner.nextDouble();
    }

    public double raio(){
        double pi = 3.14;
        return perimetro() / 2 * pi;
    }

    public void dadosCirculo(){
        System.out.println("CIRCULO -->");
        System.out.println("Area: " + area() + "Raio: " + raio());
    }
}
