package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// System.out.print("Bom");
        // System.out.print(" dia!");

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();

		System.out.printf("%s tem %d anos de idade.", nome, idade);		

		input.close();

	}
}
