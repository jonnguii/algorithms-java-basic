    package RepetitionStructure.challenges;
    import java.util.Scanner;

    class Students {
        String nome;
        float nota;

        public Students (String nome, float nota) {
            this.nome = nome;
            this.nota = nota;
        }
    }

    public class BestGrade  {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float maiornota = Integer.MIN_VALUE;
            int alunoMaiorNota = 0;

            System.out.println("-----------------");
            System.out.println("Escola Catapimbas");
            System.out.println("-----------------");
            System.out.print("Quantos alunos tem na turma? ");
            int qtdA = sc.nextInt();
            int count;
            sc.nextLine();

            Students[] alunos = new Students[qtdA]; //um array que tem como parametro seu tamanho e é exatamente o numero de alunos inseridos pelo usuario

            for (count = 0; count < qtdA; count++) { //laço de repetição. irá repetir o processo ate o numero de vezes inserida pelo usuario.


                System.out.println("-----------------");
                System.out.println("ALUNO " + (count + 1) + ": ");
                System.out.print("Nome do Aluno: ");
                String nome = sc.nextLine();
                System.out.print("Nota do Aluno: ");
                Float nota = sc.nextFloat();
                sc.nextLine();
                alunos[count] = new Students(nome, nota); // Estaremos acessando nosso array, no indice definido por cada interação do contador. A cada acesso, um objeto é criado a partir da classe Students e seus atributos.

                if (nota > maiornota) {
                    maiornota = nota;
                    alunoMaiorNota = count;
                }

            }
            Students alunoComMaiorNota = alunos[alunoMaiorNota];
            System.out.println("O aluno com maior desempenho foi " + alunoComMaiorNota.nome + " com nota: " + maiornota);
        }
}
