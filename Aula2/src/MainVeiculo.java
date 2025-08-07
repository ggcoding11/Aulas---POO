public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo fusca = new Veiculo("1985", 1986, "ASD-1234", "Vermelho");

        System.out.println("Modelo: " + fusca.modelo);
        System.out.println("Ano de fabricação: " + fusca.anoFabricacao);
        System.out.println("Cor: " + fusca.cor);
        System.out.println("Placa: " + fusca.placa);
    }
}
