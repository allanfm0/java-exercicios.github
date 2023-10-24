package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
     public Ferrari() {
        super(315);

    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;

        //delta = 350;

    }

    void acelerar() {
        velocidadeAtual += 15;
    }

	@Override
	public void ligarTurbo() {
		
		
	}

	@Override
	public void desligarTurbo() {
		
		
	}
}
