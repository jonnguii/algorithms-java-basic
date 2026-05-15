package Challenges.ListDio;

import java.util.Scanner;

public class Ex02NumeroParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = sc.nextInt();

        String isPar = (numero % 2 == 0) ? "Par" : "Impar";
        String isPositivo = (numero >= 0) ? "Positivo" : "Negativo";
        System.out.printf("O número é %s e é %s", isPar, isPositivo);

    }
}
