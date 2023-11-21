package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe sua nota: ");
		double nota = input.nextDouble();
		
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		}else if(nota >= 8.1) {
			System.out.println("Conceito A");
		}else if(nota >= 6.1) {
			System.out.println("Conceito B");
		}else if(nota >= 3.1) {
			System.out.println("Conceito C");
		}else {
			System.out.println("Conceito D");
		}
		
		input.close();
		
	}
}
