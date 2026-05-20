package Challenges.ListDio;

import Challenges.ListDio.utils.Scan;

public class Ex06Reajuste5Percent {
    public static void main(String[] args) {

        final float reajuste = 0.5f;

        System.out.print("Insira um valor: ");
        float value = Scan.sc.nextInt();
        float valueReadjusted = value + (value * reajuste);

        System.out.printf("Seu valor reajustado a 5%%: %.2f", valueReadjusted);

    }
}
