package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer i = 10000;
        System.out.println(i.toString().length());

        int num1 = 10000;
        System.out.println(Integer.toString(num1).length());

        int num2 = 12;
        System.out.println(("" + num2).toString().length());

    }
}
