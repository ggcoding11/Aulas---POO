public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
    }
}
