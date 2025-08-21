public class Main {
    public static void main(String[] args) {
        Autor stephen = new Autor("Stephen King", "Estadunidense");

        Livro it = new Livro("It", stephen);
        Livro iluminado = new Livro("O Iluminado", stephen);

        stephen.livros[0] = it;
        stephen.livros[1] = iluminado;
    }
}
