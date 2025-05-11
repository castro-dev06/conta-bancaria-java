package application;

import entities.ContaBancaria;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;
        contaBancaria = new ContaBancaria();

        int opcao;

        System.out.println();
        System.out.println("======================= CONTA BANCÁRIA =======================");
        System.out.println();

        System.out.print("Informe o nome do Titular: ");
        contaBancaria.titular = sc.nextLine();
        System.out.print("Informe o saldo inicial da conta (R$): ");
        contaBancaria.saldo = sc.nextDouble();

        System.out.println();

        do {
            System.out.println("===========================================================");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SACAR");
            System.out.println("3 - EXIBIR SALDO");
            System.out.println("0 - ENCERRAR");

            System.out.println();
            System.out.print("Escolha sua opção: ");
            opcao = sc.nextInt();

            System.out.println();

            switch (opcao){
                case 1:
                    System.out.print("Sr.(a) " + contaBancaria.titular + ", qual valor deseja depositar? ");
                    double valorDeposito = sc.nextDouble();
                    System.out.println();
                    contaBancaria.depositar(valorDeposito);
                break;
                case 2:
                    System.out.print("Sr.(a) " + contaBancaria.titular + ", qual valor deseja sacar? ");
                    double valorSaque = sc.nextDouble();
                    System.out.println();
                    contaBancaria.sacar(valorSaque);

                    break;
                case 3:
                    contaBancaria.exibirSaldo();
                break;
                case 0:
                    System.out.println("Encerrando...");
                break;
                default:
                    System.out.println("Opção Inválida! Tente novamente: ");
                break;
            }

        } while (opcao != 0);

        sc.close();

    }
}
