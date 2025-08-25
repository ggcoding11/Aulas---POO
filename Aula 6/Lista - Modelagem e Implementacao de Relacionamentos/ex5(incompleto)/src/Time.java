public class Time {
    String nome;
    String cidade;

    Jogador[] jogadores;

    Time(String nome, String cidade, Jogador jogador){
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = new Jogador[15]; //Inicializo a lista (ainda não estamos trabalhando com DINAMICA)
        //Como é 1..*, ele começa com um jogador, mas pode ter mais
        this.jogadores[0] = jogador;
    }

    void inserirJogador(String nomeJogador, String posicaoJogador){
        int i = 0;

        while (i < 15 && jogadores[i] != null){
            i++;
        }

        if (i == 15){
            System.out.println("Time cheio!");
        } else {
            jogadores[i] = new Jogador(nomeJogador, posicaoJogador);
        }
    }
}
