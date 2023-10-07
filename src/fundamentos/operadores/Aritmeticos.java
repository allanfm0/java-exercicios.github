package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 24.6;
        double y = 4.5;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);

        System.out.println(x + y * a - b);

        //operador modulo
        System.out.println(8 % 3);
        System.out.println(a % 3);
    }
}
