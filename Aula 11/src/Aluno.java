public class Aluno {
    public String nome;
    public String ra;
    public int idade;

    private static int qtdAlunos = 0;
    public static final int IDADE_MINIMA = 16;

    public Aluno(String nome, String ra, int idade) {
        if (idade >= IDADE_MINIMA){
            this.nome = nome;
            this.ra = ra;
            this.idade = idade;
            qtdAlunos++;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public static int getQtdAlunos(){
        return qtdAlunos;
    }
}
