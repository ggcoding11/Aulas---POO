public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Gustavo", 2000.00,"0000-00");

        contaBancaria.depositar(-100);
        contaBancaria.depositar(1000);

        contaBancaria.sacar(5000);
        contaBancaria.sacar(1);

        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
    }
}
