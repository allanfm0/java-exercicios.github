package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "allan");
		usuarios.put(2, "felipe");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		
	}
}
