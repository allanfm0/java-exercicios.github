package fundamentos.operadores;

public class Logicos {
    
    public static void main(String[] args) {
        
        System.out.println("TABELA VERDADE!");

        System.out.println("Tabela verdade && (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        System.out.println("Tabela verdade || (OR)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade ^ (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT (!)");
        System.out.println(!false);
        System.out.println(!true);

    }
}
