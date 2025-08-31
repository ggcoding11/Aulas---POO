public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gustavo", 6, 5);

        aluno.setNota1(-2);
        aluno.setNota1(11);

        aluno.setNota2(-23);
        aluno.setNota2(12);

        aluno.setNota1(8);
        aluno.setNota2(9);

        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
    }
}
