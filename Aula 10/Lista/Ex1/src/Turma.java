public class Turma {
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(int qntdAlunos){
        alunos = new Aluno[qntdAlunos];
        this.proximaPosicaoLivre = 0;
    }

    public void matricularAluno(Aluno aluno){
        if (proximaPosicaoLivre < alunos.length){
            alunos[proximaPosicaoLivre] = aluno;
            proximaPosicaoLivre++;
        }
    }

    public void listarAlunos(){
        for (Aluno aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
    }
}
