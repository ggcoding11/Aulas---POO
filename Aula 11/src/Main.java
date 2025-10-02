public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno("João", "123456", 18);
        Aluno pedro = new Aluno("Pedro", "1234", 20);
        Aluno carlos = new Aluno("Carlos", "45678", 19);

        System.out.println("Quantidade de alunos: " + Aluno.getQtdAlunos());

        VerificarQtd.isBoa(Aluno.getQtdAlunos());
    }
}
