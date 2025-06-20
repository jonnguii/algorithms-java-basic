package MathChallenges;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SumInt {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");


        int a = leitor.nextInt();
        int b = leitor.nextInt();
        float X = a + b;

        System.out.println("X = " + df.format(X));

    }
}