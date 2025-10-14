public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    void exibirDetalhes() {
        System.out.println("CARRO: ");
        System.out.println("Marca = " + super.getMarca());
        System.out.println("Modelo = " + super.getModelo());
        System.out.println("Ano = " + super.getAno());
        System.out.println("Número de portas = " + this.getNumeroDePortas());
    }
}
