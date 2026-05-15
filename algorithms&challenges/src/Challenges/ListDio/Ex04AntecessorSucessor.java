package Challenges.ListDio;

import java.util.Scanner;

public class Ex04AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = sc.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.printf("O número escolhido é %d, seu antecessor %d e sucessor %d", numero, antecessor, sucessor);

    }
}
