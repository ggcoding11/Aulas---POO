public class Livro {
    public String titulo;
    public String autor;

    private static int contadorLivros = 0;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

        contadorLivros++;
    }

    public static int getContadorLivros(){
        return contadorLivros;
    }
}
