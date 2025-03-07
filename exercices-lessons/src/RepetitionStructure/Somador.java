package RepetitionStructure;

import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {

        int cont = 1, num, top = Integer.MIN_VALUE, bot = Integer.MAX_VALUE;
        float soma = 0;
        Scanner sc = new Scanner(System.in);

        while (cont <= 3) {
            System.out.println("Digite o " + cont + "° valor: ");
            num = sc.nextInt();
            if (num > top) {
                top = num;
            }
            if (num < bot) {
                bot = num;
            }
            soma = num + soma;
            cont++;

        }
        System.out.println("O maior numero foi " + top);
        System.out.println("O menor numero foi " + bot);
        System.out.println("E a soma dos números digitados é: " + soma);


        sc.close();
    }
    }

