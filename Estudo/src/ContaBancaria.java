import javax.xml.catalog.Catalog;

public class ContaBancaria {
    double saldo;
    String numeroConta;
    String agencia;
    Pessoa titular;
    Cartao[] cartoes;

    ContaBancaria(double saldo, String numeroConta, String agencia, String nomeTitular, String cpfTitular, String dataNascTitular){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;

        titular = new Pessoa(nomeTitular, cpfTitular, dataNascTitular);
    }
}
