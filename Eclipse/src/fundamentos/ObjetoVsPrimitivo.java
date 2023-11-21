package fundamentos;

/**
 * @author Allan.
 * 
 * - Tudo em java é um objeto.
 * - Menos os tipos primitvos.
 * - Tipos primitivos nao sao objetos.
 * 
 */
public class ObjetoVsPrimitivo {
    public static void main(String[] args) {

        
        String s = new String("Texto");
        s.toUpperCase();


        //Wrapper sao a versao objeto dos tipos primitivos.
        int a = 12;
        System.out.println(a);
    }
}
