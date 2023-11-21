package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		//List<Usuario> lista = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("Allan");
		
		lista.add(u1);
		
		lista.add(new Usuario("Felipe"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Thais"));
		lista.add(new Usuario("Thomas"));
		
		System.out.println(lista.get(3).nome);
		
		System.out.println(">>>>>>>>> " + lista.remove(1));
		System.out.println("Tem? " + lista.contains(new Usuario("Allan")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario usu: lista) {
			System.out.println(usu);
		}
	}
}
