package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");
        
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        System.out.println(s.equals("2"));
        System.out.println("2".equals(s.trim()));

        input.close();

    }
}
