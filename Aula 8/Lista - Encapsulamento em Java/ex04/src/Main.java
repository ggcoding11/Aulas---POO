public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(-2);
        funcionario.setSalario(5400);

        System.out.println("Salário: " + funcionario.getSalario());
    }
}
