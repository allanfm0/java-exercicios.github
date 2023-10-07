package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("arroz", 0.180);
		Comida c2 = new Comida("feijao", 0.300);
		
		Pessoa pessoa = new Pessoa("Allan", 99.78);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(c1);
		System.out.println(pessoa.apresentar());
		pessoa.comer(c2);
		System.out.println(pessoa.apresentar());
		
	}
}
