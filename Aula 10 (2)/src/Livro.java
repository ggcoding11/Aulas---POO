public class Livro {
    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public String getAutor(){
        return this.autor;
    }

    public double getPreco(){
        return this.preco;
    }
}
