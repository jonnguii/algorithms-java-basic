package RepetitionStructure.repetition;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        int contD = 0;


        System.out.printf("Informe um numero: ");
        int num = scanner.nextInt();
        do {
            if (num % cont == 0) {
                contD++;
            }
            cont++;

        } while (num >= cont);
        if (contD > 2) {
            System.out.println("Este número não é primo");

        } else {
            System.out.println("É primo");
        }
    }
}