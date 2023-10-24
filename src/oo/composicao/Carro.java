package oo.composicao;

public class Carro {
    Motor motor = new Motor();

    public void acelerar() {
        motor.fatorDeInjecao += 0.4;
    }

    public void frear() {
        motor.fatorDeInjecao -= 0.4;

    }
    public void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }

    public boolean estaLigado(){
        return motor.ligado;
    }

}
