package br.com.capybird.model;

import java.util.Scanner;

public class Menu {

public void menuApp(){
    Scanner inserir = new Scanner(System.in);

    // Executar o loop enquanto o usuário não digitar 'S'
    boolean loop = true;
    while (loop) {
        // Exibir o menu
        System.out.println("----- APP VISA CASH -----");
        System.out.println("--------- MENU ---------");
        System.out.println("[L] Consulte seu limite");
        System.out.println("[C] Comprar");
        System.out.println("[E] Consulte seu Extrato");
        System.out.println("[S] Sair do APP");
        System.out.print("Digite uma opção: ");

        // Ler a opção do usuário
        String opcao = inserir.nextLine();

        // Processar a opção usando switch-case
        switch (opcao) {
            case "L":
                // Mostrar o limite
                break;
            case "C":
                // Realizar Compra

                break;
            case "E":
                // Mostrar o extrato
                System.out.println("Extrato: \n\n10/03/2023 - Saque: R$ 200,00\n12/03/2023 - Depósito: R$ 500,00");
                break;
            case "S":
                // Sair do loop
                System.out.println("Saindo do menu.");
                loop = false;
                break;
            default:
                // Opção inválida
                System.out.println("Opção inválida. Digite uma opção válida (L, C, E ou S).");
        }
    }

    inserir.close();
}
}





