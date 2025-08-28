public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        if (!novoNome.isBlank()){
            this.nome = novoNome;
        } else {
            System.out.println("Nome novo está vazio!");
        }
    }
}
