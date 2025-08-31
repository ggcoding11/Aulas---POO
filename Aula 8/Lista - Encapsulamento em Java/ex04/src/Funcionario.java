public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Valor inválido pro salário");
        }
    }
}
