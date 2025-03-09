package RepetitionStructure.challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IntelligentCounterChallenge {
    public static void main(String[] args) {

        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");

        Scanner sc = new Scanner(System.in); //Inicializar scanner

        int inicialnum; //variavel pra armazenar o numero de inicio do programa
        int finalnum; //variavel pra armazenar o numero final do programa

        //pra ajustar o formato do decimal, sem casas decimais
        DecimalFormat df = new DecimalFormat("#");

        //receber o numero inicial
        System.out.print("Inicio: ");
        inicialnum = sc.nextInt();

        //receber o numero final
        System.out.print("Final: ");
        finalnum = sc.nextInt();


        System.out.println("--------------------");
        System.out.println("  C O N T A N D O");
        System.out.println("--------------------");

        // detectar se a contagem será crescente ou decrescente
        if (inicialnum > finalnum) {
            while (inicialnum > finalnum) { //loop sem saber o valor exato (entrada do usuario)
                System.out.print(df.format(inicialnum) + ".. ");
                inicialnum--; // enquanto a entrada em "inicialnum" for maior que o contador = 0, ele decrescenta. Em algum momento ele vai zerar e encerrar o loop

            }

            } else {
            while (inicialnum <= finalnum) {
            System.out.print(df.format(inicialnum) + ".. ");
            inicialnum++; // Enquanto a entrada em "inicialnum" for menor que a entrada do numro "finalnum", ele acrescenta. Em algum momento ele vai ser igual ou maior e encerrar o loop

            }
        }   sc.close(); //fechar o scanner
    }
}