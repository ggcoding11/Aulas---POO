public class Gato extends Animal {
    private String corDoPelo;

    public Gato(String nome, int idade, String corDoPelo){
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    public void mostrarDetalhes(){
        System.out.println("Gato: ");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Cor do pelo: " + this.corDoPelo);
    }
}
