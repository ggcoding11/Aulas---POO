public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(12.34);
        Produto p2 = new Produto(32.22);

        System.out.println("Preço do produto 1: " + p1.getPrecoComImposto());
        System.out.println("Preço do produto 2: " + p2.getPrecoComImposto());

        Produto.setTaxaImposto(0.10);

        System.out.println("Preço do produto 1: " + p1.getPrecoComImposto());
        System.out.println("Preço do produto 2: " + p2.getPrecoComImposto());
    }
}
