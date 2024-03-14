package exe24;

import exe23.Motor;
import exe23.SCross;
import exe23.Veiculo;
import exe24.objetos.Circulo;
import exe24.objetos.Retangulo;
import exe24.objetos.Trapezio;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        //Retangulo retangulo = new Retangulo();
        //Trapezio trapezio = new Trapezio();

        ArrayList<Forma> formas = new ArrayList<>();
        circulo.dadosCirculo();
        String string = circulo.toString();
    }
}
