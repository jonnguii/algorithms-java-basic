package Procedures;

import java.util.Scanner;

public class OddOrEven {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        ParOuImpar(num);

    }

    public static void ParOuImpar(int inteiro) {

        if (inteiro % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}
