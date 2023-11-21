package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("allan");
		listaAprovados.add("felipe");
		listaAprovados.add("matheus");
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for (Integer i : nums) {
			System.out.println(i);
		}
	}
}
