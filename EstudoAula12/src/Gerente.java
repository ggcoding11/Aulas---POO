public class Gerente extends Pessoa{
    private String setorResponsavel;

    public Gerente(String nome, int idade, String setorResponsavel) {
        super(nome, idade);
        this.setorResponsavel = setorResponsavel;
    }

    public String getSetorResponsavel(){
        return setorResponsavel;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Setor: " + this.getSetorResponsavel());

        super.darOi();
    }
}
