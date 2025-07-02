package RepetitionStructure.challenges;
import java.util.Scanner;

public class ChoosePeoples {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //descobri que nao precisa criar vários scanners, só 1
        int contM = 0; //criei no fim do código - precisei declarar fora do loop, pois se nao, toda vez que desse uma volta, o contador sempre seria 0 e adicionaria 1
        int contF = 0; //criei no fim do código - precisei declarar fora do loop, pois se nao, toda vez que desse uma volta, o contador sempre seria 0 e adicionaria 1

        boolean loop = true; //precisei criar para encerrar o loop na opção "continuar?"
        while (loop) { //sempre true, sempre rodando
            boolean valido = false; //loop do switch case pra cor do cabelo
            System.out.println("========================"); //menu adiante
            System.out.println("   SELETOR DE PESSOAS");
            System.out.println("========================");
            System.out.print("Qual o gênero? [M/F] ");
            String genero = scn.next(); //leitura de entrada
            System.out.print("Qual a idade? ");
            int idade = scn.nextInt(); //leitura de entrada
            System.out.println("Qual a cor do cabelo? ");
            System.out.println("---------------------");
            System.out.println("[1] Preto");
            System.out.println("[2] Castanho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");
            String corCabelo = "";

            while (!valido) { //roda esse loop até ter uma entrada verdadeira [valido = true] (!valido = nao false = true)
                String entrada = scn.next(); //leitura de entrada
                switch (entrada) {
                    case "1":
                        corCabelo = ("Preto");
                        valido = true;
                        System.out.println("---------");
                        System.out.println("Selecionado: " + corCabelo);
                        System.out.println("---------");
                        break;

                    case "2":
                        corCabelo = ("Castanho");
                        valido = true;
                        System.out.println("---------");
                        System.out.println("Selecionado: " + corCabelo);
                        System.out.println("---------");
                        break;

                    case "3":
                        corCabelo = ("Loiro");
                        valido = true;
                        System.out.println("---------");
                        System.out.println("Selecionado: " + corCabelo);
                        System.out.println("---------");
                        break;

                    case "4":
                        corCabelo = ("Ruivo");
                        valido = true;
                        System.out.println("---------");
                        System.out.println("Selecionado: " + corCabelo);
                        System.out.println("---------");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente:");
                        break;

                }

            }


            if (genero.equalsIgnoreCase("M") && idade > 18 && corCabelo.equalsIgnoreCase("Castanho")) {
                contM++; }
            if (genero.equalsIgnoreCase("F") && idade >= 25 && idade <= 30 && corCabelo.equalsIgnoreCase("Loiro")) {
                contF++; }

            System.out.println("Quer continuar? [S/N]"); //o usuário encerra a aplicação e mostra os valores condicionais
            String continuar = scn.next(); //leitura de entrada

            if (continuar.equalsIgnoreCase("n")) { //encerra o loop
                loop = false;
            }

        }

        System.out.println("Total de homens com mais de 18 anos e cabelos castanhos = " + contM);
        System.out.println("Total de mulheres entre 25 e 30 anos com cabelos loiros = " + contF);
    }

}



