package Challenges.ListDio;

import Challenges.ListDio.utils.Scan;

public class Ex08OrdemDesc3Valores {
    public static void main(String[] args) {

        System.out.println("Insere 3 valores ai: ");
        int value = Scan.sc.nextInt();
        int value1 = Scan.sc.nextInt();
        int value2 = Scan.sc.nextInt();
        int maior, meio, menor;

        if (value > value1 && value > value2) {
             maior = value;

             if (value1 > value2) {
                 meio = value1;
                 menor = value2;
             } else{
                 meio = value2;
                 menor = value1;
             }

        } else if (value1 > value && value1 > value2) {
            maior = value1;
            if (value > value2) {
                meio = value;
                menor = value2;
            } else {
                menor = value;
                meio = value2;
            }
        } else {
            maior = value2;

            if(value > value1) {
                meio = value;
                menor = value1;
            } else {
                menor = value;
                meio = value1;
            }
        }
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);





    }

}
