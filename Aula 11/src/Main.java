public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", "Autor 1", 25.45);
        Livro l2 = new Livro("Livro 2", "Autor 2", 30.42);
        Livro l3 = new Livro("Livro 3", "Autor 3", 42.52);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItens(l1);
        carrinho.adicionarItens(l2);
        carrinho.adicionarItens(l3);

        carrinho.listarItens();

        carrinho.removerItem(l1);

        carrinho.listarItens();

        System.out.println("Total: R$ " + carrinho.calcularTotal());
    }
}
