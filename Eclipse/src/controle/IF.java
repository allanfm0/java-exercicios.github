package controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe sua média: ");
		double media = input.nextDouble();

		if(media <= 4.5 && media > 0){
			System.out.println("Reprovado!");
		}

		boolean recuperação = media < 7 && media >= 4.5;

		if(recuperação){
			System.out.println("Recuperação!");
		}

		if(media >= 7){
			System.out.println("Aprovado!");
		}



		input.close();
	}
}
