package Challenges.ListDio;

import Challenges.ListDio.utils.Scan;

public class Ex07VerificacaoBooleans {
    public static void main(String[] args) {


        System.out.println("Insere 2 valores ai: ");
        boolean value = Scan.sc.nextBoolean();
        boolean value1 = Scan.sc.nextBoolean();

        String equal = value == value1 ? "VERDADEIRO" : "FALSO";
        String dif = value != value1 ? "FALSO" : "VERDADEIRO";

        System.out.println(equal);
        System.out.println(dif);

    }
}
