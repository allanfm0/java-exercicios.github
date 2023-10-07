package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunosA = new double[3];
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunosA));

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunosA.length; i++) {
            totalAlunoA += notasAlunosA[i];
        }
        System.out.println(totalAlunoA / 3);
        

        double totalAlunoB = 0;
        double[] notasAlunosB = { 4.5, 5.5, 7.8, 8.9 };

        for (int i = 0; i < notasAlunosB.length; i++) {
            totalAlunoB += notasAlunosB[i];
        }
        System.out.println(totalAlunoB / notasAlunosB.length);
    }
}
