public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Gustavo");

        System.out.printf("Nome: %s", joao.getNome());

        joao.setNome("Jeremias");

        System.out.printf("Nome: %s", joao.getNome());
    }
}
