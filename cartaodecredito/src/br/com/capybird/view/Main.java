package br.com.capybird.view;


import br.com.capybird.model.CartaoDeCredito;
import br.com.capybird.model.Menu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("----- APP VISA CASH -----");


        Scanner inserir = new Scanner(System.in);

        //CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(inserir.nextDouble(),cartaoDeCredito.getSaldo(), cartaoDeCredito.getGastos() );


        Menu menu = new Menu();
        menu.menuApp();
    }
}