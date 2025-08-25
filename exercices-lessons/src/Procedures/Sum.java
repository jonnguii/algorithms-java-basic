package Procedures;

public class Sum {
    public static void main(String[] args) {

        soma(5, 8);


    }

    public static int soma(int a, int b) {
        System.out.println("Recebi o valor: " + a);
        System.out.println("Recebi o valor: " + b);
        System.out.println("A soma vale: " + (a+b));

        return a + b;

    }
}
