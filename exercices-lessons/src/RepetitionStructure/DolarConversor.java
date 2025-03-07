package RepetitionStructure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DolarConversor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double value, ptax, conversor;
        int cont = 1, quantas;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Quantas conversões deseja?: ");
        quantas = sc.nextInt();
        // for (cont = 1; cont <=4; cont++) {  LAÇO FOR PARA CASO QUISERMOS UMA QTD ESPECIFICA
            while (cont <= quantas) {
                System.out.println("Informe um valor para converter pra dólar ($): ");
                System.out.print("R$ ");
                value = sc.nextDouble();
                System.out.println("");


                ptax = 2.20;
                conversor = value / ptax;

                cont++;
                System.out.println("Valor da conversão pra dólar: " + "$ " + df.format(conversor));
            } //} FIM LAÇO FOR
    }

}
