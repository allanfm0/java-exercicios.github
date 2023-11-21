package fundamentos.operadores;

public class Ternario {
    
    public static void main(String[] args) {
        double media = 4.6;

        String resultadoFinal = media >= 7 ? 
            "aprovado" : "reprovado";

        System.out.println("Status aluno: " + resultadoFinal);

        double nota = 9.4;
        boolean bomComportamento = true;
        boolean passouDeAno = nota >= 7;
        boolean temDesconto = bomComportamento && passouDeAno;
        String resutlado = temDesconto ? "Sim!" : "Não.";

        System.out.println("Tem desconto? " + resutlado);
    }

}
