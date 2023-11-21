package classe;

public class ArealCirc {
    double raio;
    final static double PI = 3.1415;

    public ArealCirc(double raioInicial) {
        //PI = 3.14;
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
