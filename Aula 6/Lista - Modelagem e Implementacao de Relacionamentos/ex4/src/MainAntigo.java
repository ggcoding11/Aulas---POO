public class MainAntigo {
    public static void main(String[] args) {
        AutorAntigo stephen = new AutorAntigo("Stephen King", "Estadunidense");

        LivroAntigo it = new LivroAntigo("It", stephen);
        LivroAntigo iluminado = new LivroAntigo("O Iluminado", stephen);

        stephen.livros[0] = it;
        stephen.livros[1] = iluminado;
    }
}
