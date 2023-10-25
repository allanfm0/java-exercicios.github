package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.executar(4, 1));
		
		
		calculo = (x, y) -> {
			return x * y;
		};
		System.out.println(calculo.executar(4, 3));


		System.out.println(calculo.legar());
		System.out.println(Calculo.muitoLegal());
	}
}
