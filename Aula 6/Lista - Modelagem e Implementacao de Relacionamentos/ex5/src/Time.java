public class Time {
    private String nome;
    private String cidade;

    Jogador[] jogadores;

    Time(String nome, String cidade, Jogador jogador, int tamanho){
        this.nome = nome;
        this.cidade = cidade;
        //Aqui eu defini o tamanho do time e já adicionei o primeiro (pois é o mínimo segundo o diagrama)

        this.jogadores = new Jogador[tamanho]; //Inicializo a lista (ainda não estamos trabalhando com DINAMICA)
        //Como é 1..*, ele começa com um jogador, mas pode ter mais
        this.jogadores[0] = jogador;
    }

    void inserirJogador(String nomeJogador, String posicaoJogador){
        int i = 0;

        while (i < jogadores.length && jogadores[i] != null){
            i++;
        }

        if (i == jogadores.length){
            System.out.println("Time cheio!");
        } else {
            jogadores[i] = new Jogador(nomeJogador, posicaoJogador);
        }
    }

    void listarJogadores(){
        int i = 0;

        while (i < jogadores.length && jogadores[i] != null){
            System.out.println("Jogador " + (i + 1) + ": " + jogadores[i].nome);

            i++;
        }
    }
}
