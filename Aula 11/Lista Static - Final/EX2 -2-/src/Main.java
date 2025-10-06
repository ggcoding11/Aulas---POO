public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Amaciante", 20.32);
        Produto p2 = new Produto("Relogio", 150.00);

        System.out.println(p1.getPrecoComImposto());
        System.out.println(p2.getPrecoComImposto());
    }
}
