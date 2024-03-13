package exe022Locadora;

public class Teste {

    public static void main(String[] args) {
        Carro carro = new Carro("VW",
                "Fusca",
                1979,
                "STR-8888",
                4);
        System.out.println(carro.exibirDetalhes() + "\nConsumo: " + carro.calculoConsumo());
    }
}
