package Challenges.ListDio;

import java.util.Scanner;

public class Ex05QuantidadeSalarioMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double salarioMinimo = 1293.20;

        System.out.println("Insira seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double quantidade = salarioUsuario / salarioMinimo;
        System.out.printf("Você recebe %.2f salários mínimos%n", quantidade);

        sc.close();
    }
}
