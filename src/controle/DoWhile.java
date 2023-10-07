package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String texto = "";

		do{
			System.out.println("Digite sair para finalizar o programa!");
			System.out.println("Quer sair?");
			texto = input.nextLine();
		}while(!texto.equalsIgnoreCase("sair"));


		input.close();
	}
	
}
