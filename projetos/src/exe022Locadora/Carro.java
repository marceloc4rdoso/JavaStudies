package exe022Locadora;

import java.util.Scanner;

public class Carro extends Veiculo {

    private String tipoCombustivel;
    public Carro(String marca, String modelo, int anoFabricacao, String placa, int numeroLugares) {
        super(marca, modelo, anoFabricacao, placa, numeroLugares);
    }

   Scanner inserir = new Scanner(System.in);
    @Override
    public String exibirDetalhes() {
        System.out.print("Insira a Marca: ");
        setMarca(inserir.next());
        System.out.print("Insira o Modelo: ");
        setModelo(inserir.next());
        System.out.print("Insira a Ano Fabricação: ");
        setAnoFabricacao(inserir.nextInt());
        System.out.print("Insira a Placa: ");
        setPlaca(inserir.next());
        System.out.print("Insira a Número de Lugares: ");
        setNumeroLugares(inserir.nextInt());

        String exibir = "Modelo: " + getMarca();

        return exibir ;
    }

    public double calculoConsumo(){

        tipoCombustivel = "GAS";
        int idade = 2024 - getAnoFabricacao();
        double consumoGas = 10;
        if (tipoCombustivel == "GAS"){
            System.out.println("Consumo de " + consumoGas + "KM por Litro de" + tipoCombustivel );
        }
        if (idade >= 5) {
            consumoGas = consumoGas - (consumoGas * 0.5);
        }

        return consumoGas;
/*
        Use uma fórmula base que considere o tipo de combustível (gasolina,
                diesel, elétrico) com valores de eficiência distintos. Por exemplo,
    *
    *
        gasolina = 10 km/l, diesel = 12 km/l, elétrico = 0.2 kWh/km.
                Professor: Leandro Soares E-mail: leandro.soares@sp.senai.br
        Exercício de Programação:
        Sistema de Gerenciamento de Veículos para Locação
        3
    • Ajuste o consumo com base no ano de fabricação, aplicando um fator
        de melhoria anual (e.g., 0.5% de melhoria por ano para gasolina e
                diesel, 1% para elétrico).*/
    }



    /*
    *  Problema: Calcular o consumo médio de combustível com base no
    tipo de combustível e no ano de fabricação. Suponha que carros mais
    novos sejam mais eficientes.
    • Ideia para Implementação:
    • Use uma fórmula base que considere o tipo de combustível (gasolina,
    diesel, elétrico) com valores de eficiência distintos. Por exemplo,
    *
    *
    gasolina = 10 km/l, diesel = 12 km/l, elétrico = 0.2 kWh/km.
    Professor: Leandro Soares E-mail: leandro.soares@sp.senai.br
    Exercício de Programação:
    Sistema de Gerenciamento de Veículos para Locação
    3
    • Ajuste o consumo com base no ano de fabricação, aplicando um fator
    de melhoria anual (e.g., 0.5% de melhoria por ano para gasolina e
    diesel, 1% para elétrico).
    • O aluno pode pesquisar e aplicar conceitos de percentagem e
    progressão para realizar o cálculo.
    * */
}
