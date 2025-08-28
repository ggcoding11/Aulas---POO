public class Pessoa {
    private String nome;
    private int idade;

    void fazerAniversario(){
        idade++;
    }

    void exibirIdade(){
        System.out.println("Idade: " + idade);
    }

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
