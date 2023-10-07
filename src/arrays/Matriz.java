package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int qtdDeAlunos = input.nextInt();

        System.out.print("Quantiade de notas: ");
        int qtdDeNotas = input.nextInt();

        double[][] notasDaTurma = new double[qtdDeAlunos][qtdDeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasDaTurma[i][j] = input.nextDouble();
                total +=  notasDaTurma[i][j];
            }
        }

        double media = total / (qtdDeAlunos * qtdDeNotas);
        System.out.println("Média da turma: " + media);

        input.close();
    }
}
