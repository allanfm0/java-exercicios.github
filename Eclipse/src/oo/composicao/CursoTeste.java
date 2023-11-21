package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Allan");
        Curso curso1 = new Curso("Java");

        curso1.adicionarAluno(aluno1);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Estou matriculado no curso: " + curso1.nome);
            System.out.println("... e meu nome é " + aluno.nome);
        }
    }
}
