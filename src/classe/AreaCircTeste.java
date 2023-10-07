package classe;


public class AreaCircTeste {
    public static void main(String[] args) {
        ArealCirc a1 = new ArealCirc(10);
        // a1.pi = 10000;
        
        //ArealCirc.PI = 3.1415;

        System.out.println(a1.area());

        System.out.println(ArealCirc.area(100));
        System.out.println(ArealCirc.PI);
        System.out.println(Math.PI);
    }
}
