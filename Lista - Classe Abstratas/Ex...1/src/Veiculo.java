public abstract class Veiculo {
    private String nome;
    private int anoFabricacao;

    public Veiculo(String nome, int anoFabricacao){
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract double calcularSeguro();
}
