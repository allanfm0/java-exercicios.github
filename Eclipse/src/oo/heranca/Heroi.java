package oo.heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y){
        super(x, y);
    }
    
    @Override
    public boolean atacar(Jogador openente){
        boolean atacar1 = super.atacar(openente);
        boolean atacar2 = super.atacar(openente);
        boolean atacar3 = super.atacar(openente);

        return atacar1 || atacar2 || atacar3;
    }
}
