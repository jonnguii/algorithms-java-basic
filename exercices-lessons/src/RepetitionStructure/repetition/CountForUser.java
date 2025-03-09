package RepetitionStructure.repetition;

import java.util.Scanner;

public class CountForUser {
    public static void main(String[] args) {

    int numbUser, cont = 1;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe até quantos devo contar: ");
        numbUser = sc.nextInt();

        while (cont <= numbUser) {
            System.out.println(cont);
            cont++;
        }
        sc.close();
    }
}