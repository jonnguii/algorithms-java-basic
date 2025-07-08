package RepetitionStructure.repetition;

public class Combinations {
    public static void main(String[] args) {

        //Para seguir a incrementação do primeiro laço, precisa resolver o segundo. Quando atinge a condição do
        //segundo laço, ele retorna ao primeiro, o incrementando.
        for (int c1 = 1; c1 <= 5; c1++) { //repete a estrutura dentro das chaves 5 vezes conforme condicional
             for (int c2 = 1; c2 <= 3; c2++) { //repete esse laço 3 vezes conforme condicional
                System.out.print(c1 + " ");
                System.out.println(c2);
            }
        }
    }
}
