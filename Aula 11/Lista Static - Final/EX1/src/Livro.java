public class Livro {
    public String autor;
    public String titulo;

    private static int contadorDeLivros = 0;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;

        contadorDeLivros++;
    }

    public static int getContadorDeLivros(){
        return contadorDeLivros;
    }
}
