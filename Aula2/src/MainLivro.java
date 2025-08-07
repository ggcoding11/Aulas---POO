public class MainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Doutor Sono", "Stephen King", 2014);
        Livro livro2 = new Livro("IT", "Stephen King", 1983);

        System.out.println("LIVRO 1: ");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de publicação: " + livro1.anoPublicacao);

        System.out.println();

        System.out.println("LIVRO 2: ");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de publicação: " + livro1.anoPublicacao);
    }
}
