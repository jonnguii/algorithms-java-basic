package RepetitionStructure.util;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {

        int cont = 1, num, maiornota = Integer.MIN_VALUE, menornota = Integer.MAX_VALUE;
        float soma = 0;
        Scanner sc = new Scanner(System.in);

        while (cont <= 3) {
            System.out.println("Digite o " + cont + "° valor: ");
            num = sc.nextInt();
            if (num > maiornota) { //condição verdadeira forçada. Qualquer numero informado será maior que o menor número do objeto
                maiornota = num; //numero anterior digitado, armazenado
            } else if
            (num < menornota) {
                menornota = num;
            }
            soma = num + soma;
            cont++;

        }
        System.out.println("O maior numero foi " + maiornota);
        System.out.println("O menor numero foi " + menornota);
        System.out.println("E a soma dos números digitados é: " + soma);


        sc.close();
    }
    }

