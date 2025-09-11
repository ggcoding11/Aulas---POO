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

    public void exibirRelatorio(){
        System.out.println("Relatório do hotel");

        //Parei aqui!!
    }
}
