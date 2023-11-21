package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String texto1 = input.nextLine().replaceAll(",", ".");

        System.out.print("Digite o segundo salario: ");
        String texto2 = input.nextLine().replaceAll(",", ".");

        System.out.print("Digite o terceiro salario: ");
        String texto3 = input.nextLine().replaceAll(",", ".");

        double salario1 = Double.parseDouble(texto1);
        double salario2 = Double.parseDouble(texto2);
        double salario3 = Double.parseDouble(texto3);

        double soma = (salario1 + salario2 + salario3) / 3;

        System.out.println("A soma entre os três salário: R$ " + soma);
        System.out.printf("A média é: R$%.2f ", soma / 3);

        input.close();
    }

}
