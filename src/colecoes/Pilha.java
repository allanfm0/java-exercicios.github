package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Blade runner");
		livros.push("Senhor dos aneis");
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
//		
//		System.out.println(livros.remove());
//		System.out.println(livros.poll());	
		
		for (String livro : livros) {
			System.out.println(livro);
		}
	}
}
