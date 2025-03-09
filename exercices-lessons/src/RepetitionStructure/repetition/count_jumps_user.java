package RepetitionStructure.repetition;

import java.util.Scanner;

public class count_jumps_user {
    public static void main(String[] args) {

        int numbUser, jumpnumb, cont = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe até quantos devo contar: ");
        numbUser = sc.nextInt();
        System.out.println("Quer que eu conte de quanto em quanto?: ");
        jumpnumb = sc.nextInt();

        while (cont <= numbUser) {
            System.out.println(cont);
            cont = cont + jumpnumb;

        }
        sc.close();
    }
}