package RepetitionStructure.challenges;

import java.util.Scanner;

public class SuperCounter {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        while (true) {

            System.out.println("=================");
            System.out.println("|     MENU      |");
            System.out.println("=================");
            System.out.println("| [1] De 1 a 10 |");
            System.out.println("| [2] De 10 a 1 |");
            System.out.println("| [3] Sair      |");

            System.out.println("=================");
            int escolha = scanner1.nextInt();
            int cont = 1;
            int cont2 = 10;

            switch (escolha) {
                case 1:
                    System.out.print("Contando: ");
                    do {
                        System.out.print(cont + "..");
                        cont++;

                    } while (cont <= 10);
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Contando: ");
                    do {
                        System.out.print(cont2 + ".." );
                        cont2--;
                    } while (cont2 >= 1);
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Finalizando programa...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente: ");
                    break;
            }
        }
    }
}
