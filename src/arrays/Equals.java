package arrays;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Allan";
        u1.email = "allan.feliep@ezemail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Allan";
        u2.email = "allan.feliep@ezemail.com";


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u1));

    }
}
