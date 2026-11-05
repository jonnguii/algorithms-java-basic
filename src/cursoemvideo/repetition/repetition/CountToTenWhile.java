package RepetitionStructure.repetition;

import java.util.Scanner;

public class CountToTenWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while  (contador >= 10) {
            System.out.println(contador);
            contador++;
            }

        int cont = 0;
        System.out.println("De qual tabuada voce quer o resultado? ");
        int tabu = scanner.nextInt();
        do {
            int mult = tabu * cont;
            cont++;
            System.out.println(tabu + " x " + cont + " = " + mult);

        }
        while (cont < 10);



    }

}