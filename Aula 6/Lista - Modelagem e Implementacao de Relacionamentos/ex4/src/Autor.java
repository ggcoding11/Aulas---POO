public class Autor {
    String nome;
    String nacionalidade;

    Livro[] livros;

    Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.livros = new Livro[10];
        this.nacionalidade = nacionalidade;
    }
}
