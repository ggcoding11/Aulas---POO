public class Moto extends Veiculo {
    public Moto(String nome, int anoFabricacao){
        super(nome, anoFabricacao);
    }

    @Override
    public double calcularSeguro() {
        return 1500;
    }
}
