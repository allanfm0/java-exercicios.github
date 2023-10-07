package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        
        Byte b = 100;
        System.out.println(b.byteValue());

        Short s = 1000;
        System.out.println(s.toString());

        Integer i = 10000;
        System.out.println(i * 3);

        Long l = 100000L;
        System.out.println(l / 3);


        Float f = 12345.5F;
        System.out.println(f.toString());

        Double d = 987654.32;
        System.out.println(d.toString().toUpperCase());


        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toLowerCase());

        Character c = '#';
        System.out.println(c.compareTo('#'));

    }
}
