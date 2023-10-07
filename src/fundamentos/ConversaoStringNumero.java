package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        
        String s1 = JOptionPane.showInputDialog("Digite um numero: ");
        String s2 = JOptionPane.showInputDialog("Digite um numero: ");

        Double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        double soma = n1 + n2;

        System.out.println("O resultado: " + soma);
        System.out.println("A média: " + soma / 2);

        //BigDecimal
    }
}
