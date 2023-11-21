package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 9;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(4 < 5);
        System.out.println(5 >= 6);
        System.out.println(6 <= 7);

        double nota = 6.4;
        boolean bomComportamento = true;
        boolean passouDeAno = nota >= 7;
        boolean temDesconto = bomComportamento && passouDeAno;

        System.out.println("Tem desconto? " + temDesconto);


    }

}
