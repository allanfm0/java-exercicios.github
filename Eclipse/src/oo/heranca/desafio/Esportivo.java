package oo.heranca.desafio;

public interface Esportivo {
	void ligarTurbo();
	void desligarTurbo();
	
	default int velicidadeDoAr() {
		return 1;
	}
}
