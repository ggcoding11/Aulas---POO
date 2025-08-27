public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gustavo", "000.000.000-00");
        Produto p1 = new Produto("Computador", 2000);
        Produto p2 = new Produto("Laptop", 1500);

        Pedido pedido = new Pedido(cliente, p1);

        pedido.adicionarProduto(p2);

        pedido.mostrarDetalhes();
    }
}
