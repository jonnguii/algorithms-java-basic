package RepetitionStructure.repetition;

import java.util.Scanner;

public class BetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0, tot010 = 0, valor = 0, sImp = 0;

        for (cont = 0; cont < 6; cont++) {
            System.out.println("Digite um valor: ");
            valor = scanner.nextInt();
            if (valor >= 0 && valor <= 10) {
                tot010++;
                if (valor % 2 != 0) {
                    sImp = sImp + valor;
                }
            }
        }
        System.out.println("Existem " + tot010 + " valores entre 0 e 10 e a soma entre eles sendo impares dá: " + sImp );
    }
}