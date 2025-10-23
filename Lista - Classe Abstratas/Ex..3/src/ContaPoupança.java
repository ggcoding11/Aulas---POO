public class ContaPoupança extends Conta {
    public ContaPoupança(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularTaxas() {
        System.out.println("Saldo com taxas: " + super.getSaldo());
    }
}
