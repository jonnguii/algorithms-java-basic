package Challenges.ListDio;

import java.util.Scanner;

public class Ex03SomaOuMultiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int A = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        int B = sc.nextInt();

        int C = (A == B) ? (A + B) : (A * B);

        System.out.println(C);

    }
}
