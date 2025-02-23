package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Conta;
import model.ContaEspecial;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("Menu:\n");
            System.out.println("1 - Criar nova Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("\nSaindo...");
                break;
            } else if (opcao == 1) {
                System.out.println("\nEscolha o tipo de conta:");
                System.out.println("1 - Conta");
                System.out.println("2 - ContaEspecial");
                System.out.println("3 - ContaPoupanca");
                System.out.print("Opção: ");
                int tipoConta = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                System.out.print("Digite o numero da conta ");
                int numeroConta = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o nome do titular: ");
                String titular = scanner.nextLine();

                System.out.print("Digite o saldo inicial: ");
                double saldo = scanner.nextDouble();

                Conta conta = null;
                switch (tipoConta) {
                    case 1:
                        conta = new Conta(numeroConta, titular, saldo);
                        break;
                    case 2:
                        System.out.print("Digite o limite da Conta Especial: ");
                        double limite = scanner.nextDouble();
                        conta = new ContaEspecial(numeroConta, titular, saldo,limite);
                        break;
                    case 3:
                        System.out.print("Digite a taxa de rendimento da Conta Poupança: ");
                        double rendimento = scanner.nextDouble();
                        conta = new ContaPoupanca(numeroConta, titular, saldo,rendimento);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }

                contas.add(conta);
                System.out.println("Conta criada com sucesso!");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}