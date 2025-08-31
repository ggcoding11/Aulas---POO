public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("It", "Stephen King", true);

        System.out.println("Disponível: " + livro.isDisponivel());

        livro.devolver();

        livro.emprestar();

        System.out.println("Disponível: " + livro.isDisponivel());

        livro.devolver();

        System.out.println("Disponível: " + livro.isDisponivel());
    }
}
