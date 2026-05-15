package Challenges.ListDio;

import java.util.Scanner;

public class Ex01SomaComparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: " );
        float valueA = sc.nextFloat();
        System.out.print("Insira o valor de B: " );
        float valueB = sc.nextFloat();
        System.out.print("Insira o valor de C: " );
        float valueC = sc.nextFloat();

        float soma = (valueA + valueB);
        System.out.printf("%.2f + %.2f + = %.2f", valueA, valueB, soma);
        if (soma < valueC) {
            System.out.printf(" e o resultado dessa soma é menor que %.2f ", valueC);
        }


    }

}
