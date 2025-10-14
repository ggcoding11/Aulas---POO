public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, String cpf, String ra){
        super(nome, cpf);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("R.A: " + this.getRa());
    }
}
