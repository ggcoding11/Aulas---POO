public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Ka", 1992, 2);
        Moto m1 = new Moto("Honda", "Freeway", 1996, 150);

        c1.exibirDetalhes();

        System.out.println();

        m1.mostrarDetalhes();
    }
}

