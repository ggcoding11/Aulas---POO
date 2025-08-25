public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pedro", "Goleiro");

        Time time = new Time("Inter", "Brasilia", jogador, 2);

        time.inserirJogador("Gustavo", "Goleiro2");
        time.inserirJogador("Julio", "Goleiro3");
        time.inserirJogador("Augusto", "Goleiro4");

        time.listarJogadores();
    }
}
