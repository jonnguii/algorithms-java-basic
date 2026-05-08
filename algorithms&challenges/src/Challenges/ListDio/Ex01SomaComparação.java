package Challenges.ListDio;

import java.util.Scanner;

public class Ex01SomaComparação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: " );
        float valueA = sc.nextFloat();
        System.out.print("Insira o valor de B: " );
        float valueB = sc.nextFloat();
        System.out.print("Insira o valor de C: " );
        float valueC = sc.nextFloat();

        float soma = (valueA + valueB);
        System.out.println(valueA + " + " + valueB + " = " + soma);
        if (soma < valueC) {
            System.out.println("e essa soma é menor que " + valueC);
        }


    }

}
