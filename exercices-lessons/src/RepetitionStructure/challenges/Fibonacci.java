package RepetitionStructure.challenges;

public class Fibonacci {
    public static void main(String[] args) {

        //a sequencia de fibonacci eh a soma dos dois números anteriores para gerar o próximo
        // 0 1 1 2 3 5 8 13 [...]

        int primeiroValor = 0;
        int segundoValor = 1;


        for (int cont = 0; cont < 15; cont++) {
            System.out.print(primeiroValor + " ");
            int proximoValor = primeiroValor + segundoValor;
            primeiroValor = segundoValor;
            segundoValor = proximoValor;
        }





    }
}
