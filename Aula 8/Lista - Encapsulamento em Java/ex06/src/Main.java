public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 25.45f);

        System.out.println("Preco: " + produto.getPreco());

        produto.setPreco(-2);

        produto.setPreco(45.45f);

        System.out.println("Preco: " +  produto.getPreco());
    }
}
