/*
* Ao remover na lista estática, temos que tomar o cuidado
* de colocar null no lugar dos itens removidos. Sem contar que
* se eu remover manualmente, ficaria um buraco no array, então para percorrer nas próximas
* vezes fica bem mais complicado
* */

public class Aluno {
    private String nome;
    private int idade;
    private int ra;

    public Aluno(String nome, int idade, String ra){
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }
}
