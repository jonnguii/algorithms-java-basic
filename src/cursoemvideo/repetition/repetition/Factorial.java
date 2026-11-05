package RepetitionStructure.repetition;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            int numUser = 0;
            System.out.println("Quer qual numero pra calcular o fatorial? ");
            numUser = scanner.nextInt();
            int cont = numUser;
            int fator = 1;

                do {
                    System.out.printf("%d, ", cont);
                    fator = fator * cont;
                    cont--;
                } while (cont > 0);
                System.out.println("O resultado do numero fatorial " + numUser + " é: " + fator);
                System.out.println("Deseja calcular outro número? (sim/não): ");
                continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("sim"));
        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}


