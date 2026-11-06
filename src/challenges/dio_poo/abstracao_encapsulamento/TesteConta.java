package challenges.dio_poo.abstracao_encapsulamento;

import java.math.BigDecimal;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o deposito inicial: ");
        BigDecimal saldoInicial = new BigDecimal(scanner.next().replace(",", "."));

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n--- MENU CONTA BANCARIA ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Verificar se esta usando Cheque Especial");
            System.out.println("6 - Sair");
            System.out.print("Opcao: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Cheque Especial: R$ " + conta.getChequeEspecial());
                    break;

                case 3:
                    System.out.print("Valor do deposito: ");
                    BigDecimal deposito = new BigDecimal(scanner.next().replace(",", "."));
                    conta.depositar(deposito);
                    System.out.println("Deposito efetuado!");
                    break;

                case 4:
                    System.out.print("Valor do saque: ");
                    BigDecimal saque = new BigDecimal(scanner.next().replace(",", "."));
                    conta.sacar(saque);
                    System.out.println("Saque efetuado!");
                    break;

                case 5:
                    if (conta.isUsingChequeEspecial()) {
                        System.out.println("Status: Esta usando cheque especial.");
                    } else {
                        System.out.println("Status: NAO esta usando cheque especial.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        scanner.close();
    }
}
