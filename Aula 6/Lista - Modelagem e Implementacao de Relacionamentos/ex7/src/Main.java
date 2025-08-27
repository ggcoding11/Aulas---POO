public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jonas", 28, 10);

        System.out.println("DADOS DO PROFESSOR: ");
        System.out.println("Nome: " + prof1.nome);
        System.out.println("Idade: " + prof1.idade);

        Disciplina mat1 = new Disciplina("Geografia");
        Disciplina mat2 = new Disciplina("Matemática");
        Disciplina mat3 = new Disciplina("Sociologia");

        prof1.adicionarDisciplina(mat1);
        prof1.adicionarDisciplina(mat2);
        prof1.adicionarDisciplina(mat3);

        prof1.mostrarDisciplinas();
    }
}
