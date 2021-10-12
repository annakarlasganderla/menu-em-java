package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma das opçoes abaixo");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Editar cadastro");
            System.out.println("3 - Ver pessoas cadastradas");
            System.out.println("----------------------------");


            System.out.print("Digite aqui sua opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("cadastro em andamento");
                    System.out.println("4 - voltar");
                    break;

                case 2:
                    System.out.println("modo editar em andamento");
                    System.out.println("4 - voltar");
                    break;

                case 3:
                    System.out.println("modo visualização em andamento");
                    System.out.println("4 - voltar");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("isso é um teste");
                    System.out.println("4 - voltar");
                    break;
            }
        } while(opcao != 0);
    }
}
