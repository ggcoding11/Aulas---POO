public class Main {
    public static void main(String[] args) {
        Hotel bonaparte = new Hotel("Hotel Bonaparte", "Rua 3", 140, "Grande", 150.45);

        bonaparte.adicionarQuarto(141, "Pequeno", 140.44);
        bonaparte.adicionarQuarto(123, "Média", 162.34);
        bonaparte.adicionarQuarto(154, "Grande", 153.45);

        Hospede h1 = new Hospede("Gustavo", "000.000.00-00");
        Hospede h2 = new Hospede("Maria", "000.000.000-00");

        bonaparte.hospedarCliente(bonaparte.getQuartos().get(0), h1);

        bonaparte.exibirRelatorio();
    }
}
