public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, String cpf, double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
    }

    @Override
    public double getBonus() {
        return super.getSalario() * 0.05;
    }
}
