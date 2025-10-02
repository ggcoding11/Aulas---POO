public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(12.34);

        Produto.setTaxaImposto(0.10);

        System.out.println(p1.getPrecoComImposto());
    }
}
