package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		
		fila.add("Ana");
		fila.offer("Allan");
		
		System.out.println(fila.element());
		System.out.println(fila.peek());
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
