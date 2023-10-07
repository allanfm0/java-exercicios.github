package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 4356.89);

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 4.99; 

        Produto.desconto = 0.50;

        System.out.println(produto1.nome);
        System.out.println(produto2.nome);

        double precoFinal = produto1.produtoComDesconto();
        double precoFinal2 = produto2.produtoComDesconto(0.1);
        System.out.printf("Produto com desconto: R$%.2f \n", precoFinal);
        System.out.printf("Produto com desconto: R$%.2f \n", precoFinal2);

        double mediaCarrinho = (precoFinal + precoFinal2) / 2;
        System.out.printf("Média do carrinho: R$%.2f.", mediaCarrinho);
    }
}
