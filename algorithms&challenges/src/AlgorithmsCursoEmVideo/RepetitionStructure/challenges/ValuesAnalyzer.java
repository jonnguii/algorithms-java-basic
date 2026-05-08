package RepetitionStructure.challenges;

import java.util.Scanner;

public class ValuesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0;
        int divisivel5 = 0;
        int nulo = 0;
        int somaNumeroPar = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.print("Digite o " + cont + "º valor: ");
            int valorDigitado = scanner.nextInt();
            if (valorDigitado % 5 ==0) {
                divisivel5++;
            }
            if (valorDigitado == 0) {
                 nulo++;
            }

            if (valorDigitado % 2 == 0) {
                somaNumeroPar = somaNumeroPar + valorDigitado;
            }

            switch (cont) {
                case 1:
                    valor1 = valorDigitado;
                    break;
                case 2:
                    valor2 = valorDigitado;
                    break;
                case 3:
                    valor3 = valorDigitado;
                    break;
                case 4:
                    valor4 = valorDigitado;
                    break;
                case 5:
                    valor5 = valorDigitado;
                    break;
            }
        }
        float soma = valor1 + valor2 + valor3 + valor4 + valor5;
        System.out.println("A soma dos valores é = " + soma);
        float media = soma / 5;
        System.out.println("A media dos valores é = " + media);
        System.out.println("Valores divisiveis por 5: " + divisivel5);
        System.out.println("Valores nulos: " + nulo);
        System.out.println("A soma dos valores pares é: " + somaNumeroPar);


    }
}
