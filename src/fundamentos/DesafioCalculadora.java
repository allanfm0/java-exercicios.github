package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero -> ");
        double n1 = input.nextDouble();

        System.out.print("Digite outro numero -> ");
        double n2 = input.nextDouble();

        System.out.print("Informe a operação -> ");
        String op = input.next();

        double resutlado = "+".equals(op) ? n1 + n2 : 0;
        resutlado = "-".equals(op) ? n1 - n2 : resutlado;
        resutlado = "*".equals(op) ? n1 * n2 : resutlado;
        resutlado = "/".equals(op) ? n1 / n2 : resutlado;
        resutlado = "%".equals(op) ? n1 % n2 : resutlado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resutlado);

        input.close();
    }
}
