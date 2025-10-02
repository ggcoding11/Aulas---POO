public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Stephen King", "IT");
        Livro l2 = new Livro("Stephen King", "Cujo");

        System.out.println("Quantidade de livros: " + Livro.getContadorDeLivros());
    }
}
