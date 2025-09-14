import java.util.ArrayList;

public class Hotel {
    String nome;
    String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco, int numero, String tipo, double precoPorNoite){
        this.nome = nome;
        this.endereco = endereco;

        quartos = new ArrayList<>();

        Quarto q = new Quarto(numero, tipo, precoPorNoite);

        quartos.add(q);
    }

    public void adicionarQuarto(int numero, String tipo, double precoPorNoite){
        Quarto q = new Quarto(numero, tipo, precoPorNoite);

        quartos.add(q);
    }

    public void hospedarCliente(Quarto quarto, Hospede hospede){
        quarto.setOcupado(true);
        quarto.setHospedeAtual(hospede);
    }

    public void realizarCheckout(Quarto quarto){
        quarto.setOcupado(false);
        quarto.setHospedeAtual(null);
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void exibirRelatorio(){
        System.out.println("Relatório do hotel");

        System.out.println();

        for (Quarto quarto: this.quartos){
            System.out.println("Quarto " + (quartos.indexOf(quarto) + 1) + ": ");
            System.out.println("Tipo: " + quarto.getTipo());
            System.out.println("Número: " + quarto.getNumero());
            System.out.println("Preço por noite: " + quarto.getPrecoPorNoite());
            System.out.println("Ocupado: " + quarto.isOcupado());

            if (quarto.getHospedeAtual() != null){
                System.out.println("Nome do hóspede: " + quarto.getHospedeAtual().nome);
                System.out.println("CPF: " + quarto.getHospedeAtual().cpf);
            }

            System.out.println();
            System.out.println();
        }
    }
}
