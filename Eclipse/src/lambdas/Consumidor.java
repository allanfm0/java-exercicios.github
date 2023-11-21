package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);

		Produto p1 = new Produto("Canete", 2.78, 0.09);
		Produto p2 = new Produto("Lapis", 3.59, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2);
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
