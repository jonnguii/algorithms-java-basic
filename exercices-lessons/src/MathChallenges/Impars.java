package MathChallenges;
import java.io.IOException;
import java.util.Scanner;

public class Impars {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

        while (cont <6) {

            if (x % 0 == 0) {
                x++;

            }
            System.out.println (x);
            x += 2;
            cont++;
        }


    }
}

