package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();

        Data data2 = new Data(12, 2, 2002);

        System.out.println(data1.dataFormatada());
        System.out.println(data2.dataFormatada());

    }
}
