import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta-Corrente";
        String agenciaConta = "0050";
        double saldo = 1599.99;
        double deposito = 0;
        double saque = 0;
        double saldoAtualizado = 0;

        int opcoesMenu = 0;

        Scanner inserir = new Scanner(System.in);

        String inicio = """
                ╔═════════════════════════════════════════╗
                ║      ALURA BANK                         ║
                ║      O banco do dev competente!         ║
                ╚═════════════════════════════════════════╝                
                """;
        System.out.println(inicio);
        //Menu

        String menu = """
                ╔═════════════════════════════════════════╗
                ║ Selecione uma Opção:                    ║
                ║ [1] Vizualizar Saldo [2] Dados da Conta ║
                ║ [3] Depositar        [4] Sacar          ║
                ║ [5] Transferir                          ║
                ╚═════════════════════════════════════════╝
                """;

        while (opcoesMenu != 5){
            System.out.println(menu);
            System.out.print("INSIRA A OPÇÃO >>> ");
            opcoesMenu = inserir.nextInt();
            switch(opcoesMenu) {
                case 1:
                    System.out.println("╔═════════════════════════════════════════╗");
                    System.out.println("║ SALDO:                                  ║");
                    System.out.println("║  Titular:  " + nome + "                 ║");
                    System.out.println("║  Saldo: R$ " + saldo + "                ║");
                    System.out.println("╚═════════════════════════════════════════╝");
                    break;
                case 2:
                    System.out.println("╔═════════════════════════════════════════╗");
                    System.out.println("║ DADOS BANCÁRIOS:                        ║");
                    System.out.println("║  Nome titular:  " + nome + "            ║");
                    System.out.println("║  Agência Conta: " + agenciaConta + "    ║");
                    System.out.println("║  Tipo conta:    " + tipoConta + "       ║");
                    System.out.println("╚═════════════════════════════════════════╝");
                    break;
                case 3:
                    System.out.print("Valor à depositar >>> ");
                    deposito = inserir.nextInt();
                    saldoAtualizado = saldo + deposito;
                    System.out.println("╔═════════════════════════════════════════╗");
                    System.out.println("║ DEPÓSITO:                               ║");
                    System.out.println("║  Valor depósito: " + deposito + "       ║");
                    System.out.println("║  Saldo Atual: " + saldoAtualizado +"    ║");
                    System.out.println("╚═════════════════════════════════════════╝");
                    break;
                // ...
                case 4:
                    System.out.print("Valor à sacar >>> ");
                    saque = inserir.nextInt();
                    if (saque > saldoAtualizado){
                        System.out.println("Saldo Insuficiente para saque");
                    } else {
                        saldoAtualizado -= saque;
                        System.out.println("╔═════════════════════════════════════════╗");
                        System.out.println("║ SAQUE:                                  ║");
                        System.out.println("║  Valor saque: " + saque + "             ║");
                        System.out.println("║  Saldo Atual: " + saldoAtualizado +"    ║");
                        System.out.println("╚═════════════════════════════════════════╝");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

}

