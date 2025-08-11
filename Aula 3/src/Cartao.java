public class Cartao {
    String codigo;
    String validade;
    String cvv;
    ContaBancaria contaBancaria;

    Cartao(String codigo, String validade, String cvv, ContaBancaria contaBancaria){
        this.codigo = codigo;
        this.validade = validade;
        this.cvv = cvv;
        this.contaBancaria = contaBancaria;
        //Como é uma agregação, contaBancária não é criado aqui, já existe, então é só adicionar normalmente
    }
}
