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
        super.mostrarDetalhes();
        System.out.println("R.A: " + this.getRa());
    }
}
