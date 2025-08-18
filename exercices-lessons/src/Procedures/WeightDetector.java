package Procedures;
import java.util.Scanner;

public class WeightDetector {
    static String pesado;
    static Float maior = 0f;

    public static void main(String[] args) {
        String nome;
        Float peso;
        Scanner scanner = new Scanner(System.in);

        topo();
        for (int i = 0; i < 5; i++) {
            System.out.println("INFORME O NOME: ");
            nome = scanner.next();
            System.out.println("INFORME O PESO DE " + nome + ": ");
            peso = scanner.nextFloat();
            if (peso > maior) {
                maior = peso;
                pesado = nome;
            }
            topo();
        }
        topo();
        System.out.println("A pessoa mais pesada foi: " + pesado + " com     " + maior + "KG");

    }

    public static void topo() {
        System.out.println("-------------------------------------");
        System.out.println("    D E T E C T O R D E P E S A D O");
        System.out.println("    MAIOR PESO ATE AGORA: " + maior + " KG");
        System.out.println("-------------------------------------");

    }



}
