public class Aluno {
    String nome;
    double nota1;
    double nota2;

    Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void exibirDados(){
        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Média: %.2f\n", calcularMedia());
    }

    double calcularMedia(){
        double soma = nota1 + nota2;
        return soma/2;
    }

}
