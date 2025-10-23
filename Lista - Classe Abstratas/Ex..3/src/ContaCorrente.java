public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularTaxas() {
        System.out.println("Saldo com taxas: " + (super.getSaldo() - 15));
    }
}
