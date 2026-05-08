package RepetitionStructure.repetition;

import java.util.Scanner;

public class ParNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont;
        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor % 2 != 0) {
            valor = valor - 1;
        }

        for (cont = valor; cont >= 0; cont = cont - 2) {
            System.out.println(cont);
        }
    }
}