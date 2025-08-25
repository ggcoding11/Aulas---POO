public class AutorAntigo {
    String nome;
    String nacionalidade;

    LivroAntigo[] livros;

    AutorAntigo(String nome, String nacionalidade){
        this.nome = nome;
        this.livros = new LivroAntigo[10];
        this.nacionalidade = nacionalidade;
    }
}
