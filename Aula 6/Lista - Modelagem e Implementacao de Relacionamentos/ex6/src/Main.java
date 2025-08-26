public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua 2", "Quarto", 3);

        casa.mostrarComodos();

        casa.adicionarComodo("Cozinha");
        casa.adicionarComodo("Quintal");
        casa.adicionarComodo("Banheiro");

        casa.mostrarComodos();
    }
}
