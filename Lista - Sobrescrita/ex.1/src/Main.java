public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Fiat", "Uno");
        Carro c1 = new Carro("Fiat", "Uno2");
        Moto m1 = new Moto("Fiat", "Uno3");

        System.out.println(v1.calcularPedagio());
        System.out.println(c1.calcularPedagio());
        System.out.println(m1.calcularPedagio());
    }
}
