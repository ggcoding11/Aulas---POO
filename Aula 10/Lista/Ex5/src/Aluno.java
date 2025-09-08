/*
* O proximaPosicaoLivre está no código para ter um controle.
* Já que eu adiciono "da esquerda pra direita" no vetor, eu uso essa
* variável como um limite na hora de percorrer. Se eu usasse o .length()
* ao invés dele, dependendo de como você implementasse, você poderia percorrer
* por valores com nada dentro (null), enquanto com o proximaPosicaoLivre eu consigo
* ter um controle!
*  */

public class Aluno {
    private String nome;
    private int idade;
    private int ra;

    public Aluno(String nome, int idade, int ra){
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }
}
