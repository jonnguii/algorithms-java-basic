package MathChallenges;
import java.io.IOException;
import java.util.Scanner;

public class MostValues {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int v1, v2, v3, v4, v5;
        int par = 0, impar = 0, posi, negat;

        v1 = leitor.nextInt();

        if (v1 % 2 == 0) {
            v1++;
            impar++;
        } else {
            par++;
        }

        // System.out.println( + " par(es)");
            System.out.println(impar + " impar(es)");
        //  System.out.println( + " positivo(s)");
        //System.out.println( + " negativo(s)");

    }

}

//Ler 5 valores int. Sout par, impar, posi e negativo. 0 é positivo, mas nao é considerado.
// Logica armazenada em variaveis com o nome, tipo "par", que define se o numero é par. As chamo no sout
//Cria um loop pra percorrer os valores recebidos
// se v1 for impar; int impar =+ 1
//sout impar
// se v2 for impar; int impar =+ 1