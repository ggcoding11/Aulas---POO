public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("IT", "Stephen King");
        Livro l2 = new Livro("O Iluminado", "Stephen King");

        System.out.println("Contagem: " + Livro.getContadorLivros());
    }
}
