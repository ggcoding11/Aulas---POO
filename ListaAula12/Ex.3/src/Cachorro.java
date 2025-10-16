public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }

    public void mostrarDetalhes(){
        System.out.println("Cachorro: ");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Raça: " + this.raca);
    }
}
