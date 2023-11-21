package fundamentos;

public class TipoPrimitivos {
	public static void main(String[] args) {
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 43256;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais
		
		float salario = 11_445F;
		double vendasAcumuladas = 22_456_542_678.001;
		
		//Tipo booleano
		
		boolean estaDeFerias = true;
		
		//Tipo Caracter
		char status = 'A'; // ativo;
		
		
		//Dias de empresas;
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
