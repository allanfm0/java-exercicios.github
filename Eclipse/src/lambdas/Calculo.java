package lambdas;

@FunctionalInterface
public interface Calculo {
	double executar(double x, double y);

	default String legar(){
		return "legar";
	}

	static String muitoLegal(){
		return "Muito Legal!";
	}
	//double teste();
}
