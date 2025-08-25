public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gustavo", "Brasileiro");

        Livro livro1 = new Livro("IT", autor);
        Livro livro2 = new Livro("O cemiterio", autor);

        System.out.println(livro1.autor.nome);
        System.out.println(livro2.autor.nacionalidade);
    }
}
