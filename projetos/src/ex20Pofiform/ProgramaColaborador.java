package ex20Pofiform;

import java.util.Scanner;

public class ProgramaColaborador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de colaboradores: ");
        int quantidade = sc.nextInt();

        Colaborador colaboradores[] = new Colaborador[quantidade];

        for (int i = 0; i < colaboradores.length; i++) {

            System.out.println("Dados do colaborador #" + (i + 1));

            System.out.print("Colaborador terceirizado (s/n)?: ");
            char opcao = sc.next().charAt(0);


            if (opcao == 'n') {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Horas trabalhadas: ");
                int hora = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();

                colaboradores[i] = new Colaborador(nome, hora, valorPorHora);
            } else if (opcao == 's') {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Horas trabalhadas: ");
                int hora = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();
                System.out.print("Custo adicional: ");
                double custoAdicional = sc.nextDouble();

                colaboradores[i] = new ColaboradorTerceirizado(nome, hora, valorPorHora, custoAdicional);
            }

        }

        System.out.println("PAGAMENTOS");

        for (Colaborador colaborador : colaboradores) {
            System.out.printf("%s - R$ %.2f %n",colaborador.getNome(),colaborador.pagamento());
        }













//        Scanner sc = new Scanner(System.in);
//        System.out.print("Insira a quantidade de colaboradores: ");
//        int quantidade = sc.nextInt();
//
//        Colaborador colaboradores[] = new Colaborador[quantidade];
//
//        for (int i = 0; i < colaboradores.length; i++) {
//            System.out.println(i);
//        }

//        colaboradores[0] = new Colaborador("Maria",50,35);
//        colaboradores[1] = new ColaboradorTerceirizado("Ana",100,50,350);
//
//
//        for (Colaborador colaborador:colaboradores) {
//            System.out.printf("%s - R$ %.2f %n",colaborador.getNome(),colaborador.pagamento());
//            if (colaborador instanceof ColaboradorTerceirizado){
//                System.out.println("TERCEIRIZADO");
//            }

    }


}

