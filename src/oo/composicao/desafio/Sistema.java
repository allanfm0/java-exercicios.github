package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Allan");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Canete", 9.76, 100);

        //cliente.compras.add(compra1);
        cliente.adicionarCompra(compra1);
        // System.out.println(cliente.obterValorTotal());
        System.out.println("O cleinte " + cliente.nome + " comprou " + compra1.obterValorTotal() + " reais!");
    }
}
