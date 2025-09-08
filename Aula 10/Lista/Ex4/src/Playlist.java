public class Playlist {
    private Musica[] musicas;
    private int proximoEspacoVazio;

    public Playlist(){
        this.proximoEspacoVazio = 0;
        this.musicas = new Musica[20];
    }

    public void adicionarMusica(Musica musica){
        if (proximoEspacoVazio < musicas.length) {
            musicas[proximoEspacoVazio] = musica;
            proximoEspacoVazio++;
        }
    }
}
