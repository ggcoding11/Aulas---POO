public class ContaBancaria {
    double saldo;
    String numeroConta;
    String agencia;
    Cartao[] cartoes;
    //A conta bancária não tem o cartão no construtor, pois a conta bancária pode existir antes do cartão
    Pessoa titular;

    ContaBancaria(double saldo, String numeroConta, String agencia, String nomePessoa, String cpfPessoa, String dataNascPessoa){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;

        //Detalhe que, como se trata de uma composição, a Pessoa virtual só é criada quando a conta é criada também
        titular = new Pessoa(nomePessoa, cpfPessoa, dataNascPessoa);

        //Dúvida: por que eu criei a variável Pessoa ali em cima, e não no construtor?
        //Se eu criasse no construtor, seria uma variável local, quando acabasse o espaço seria liberado
        //Tudo que for atributo de classe deve ficar ali em cima!
    }
}
