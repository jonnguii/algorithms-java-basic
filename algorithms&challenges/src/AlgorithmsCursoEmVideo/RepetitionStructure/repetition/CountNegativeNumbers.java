package RepetitionStructure.repetition;

import java.util.Scanner;

public class CountNegativeNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int cont = 0;
        int num = 0;
        int numN = 0;

        do {
            System.out.println("Informe um numero");
            num = scanner.nextInt();
            if (num < 0) {
                numN++;
            }
            cont++;
        } while (cont <= 5);
        System.out.println("A quantidade de numeros negativos são: " + numN);
    }
}