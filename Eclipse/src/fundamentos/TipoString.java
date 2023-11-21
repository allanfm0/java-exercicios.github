package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Bom dia!";
		
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toUpperCase().startsWith("BOM"));
		
		System.out.println(s.equalsIgnoreCase("Bom dia!"));
		
		var nome = "Allan";
		var sobrenome = "Felipe";
		var idade = 19;
		var salario = 12345.99;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos de idade, e ganha R$%.2f\n", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos de idade, e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
