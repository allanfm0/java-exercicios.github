package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5 / 9 = °C
		
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double faren = 0;
		
		double calculo = (faren - AJUSTE) * FATOR;
		System.out.println("Graus Celcius = " + calculo + "°C");
	}
	
}
