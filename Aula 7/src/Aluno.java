public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirDetalhes(){
        System.out.println("Aluno");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Nota 1: %f\n", nota1);
        System.out.printf("Nota 2: %f\n", nota2);
        System.out.printf("Media: %f\n", calculoMedia());
        isAprovado();
    }

    private void isAprovado(){

        if (calculoMedia() >= 6.0){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }

    }


    private double calculoMedia(){

        double soma = nota1 + nota2;

        return soma/2;
    }

}
