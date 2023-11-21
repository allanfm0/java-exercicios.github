package arrays;

public class ExercicioForeach {
    public static void main(String[] args) {
        double[] notas = { 4.5, 6.7, 8.9, 9.9 };

        double totalNotasAlunoA = 0;
        for (double nota : notas) {
            totalNotasAlunoA += nota;
        }
        double media = totalNotasAlunoA / notas.length;
        System.out.println("Media do aluno foi: " + media);
        
    }
}
