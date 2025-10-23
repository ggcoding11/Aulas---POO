public class Carro extends Veiculo{
    public Carro(String nome, int anoFabricacao){
        super(nome, anoFabricacao);
    }

    @Override
    public double calcularSeguro() {
        return 2000;
    }
}
