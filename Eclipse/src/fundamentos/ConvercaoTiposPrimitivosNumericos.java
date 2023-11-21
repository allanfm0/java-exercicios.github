package fundamentos;

public class ConvercaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1;// implicita
        System.out.println(a);

        int i = 4;
        byte b = (byte) i; // converção exlpicita (CAST);
        System.out.println(b);

        double d = 1.9999999;
        int c = (int) d;
        System.out.println(c);

    }
}
