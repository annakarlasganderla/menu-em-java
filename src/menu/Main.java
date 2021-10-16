package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao = 4;

        do {
            do {
                System.out.println("Escolha uma das opçoes abaixo");
                System.out.println("1 - Cadastrar pessoa");
                System.out.println("2 - Editar cadastro");
                System.out.println("3 - Ver pessoas cadastradas");
                System.out.println("----------------------------");
                System.out.print("Digite aqui sua opção: ");
                opcao = leitor.nextInt();
            } while (opcao == 4);

            switch (opcao) {
                case 1:
                    System.out.println("cadastro em andamento");
                    System.out.println("4 - voltar");
                    opcao = leitor.nextInt();
                    break;

                case 2:
                    System.out.println("modo editar em andamento");
                    System.out.println("4 - voltar");
                    opcao = leitor.nextInt();
                    break;

                case 3:
                    System.out.println("modo visualização em andamento");
                    System.out.print("4 - voltar ");
                    opcao = leitor.nextInt();
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println("4 - voltar");
                    opcao = leitor.nextInt();
                    break;
            }
        } while(opcao != 0);
    }
}