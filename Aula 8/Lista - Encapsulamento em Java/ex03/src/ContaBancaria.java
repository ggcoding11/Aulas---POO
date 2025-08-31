public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depositar!");
        }
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor excedido!");
        }
    }
}
