public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro já foi emprestado");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        } else {
            System.out.println("Livro já está disponível!");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
