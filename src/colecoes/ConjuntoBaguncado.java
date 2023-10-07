package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add("Teste");// String
		conjunto.add(true); // boolean -> Boolean
		conjunto.add(1);// int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		//Nao aceita repetição!
		System.out.println("Tamanho é: " + conjunto.size());
		
		
		//Remover elemento:
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é: " + conjunto.size());
		
		//O elemento contem no HashSet?
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains(1));
		System.out.println("Tamanho é: " + conjunto.size());
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}
}
