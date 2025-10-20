import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Ka", 1992, 2);
        Moto m1 = new Moto("Honda", "Freeway", 1996, 150);

        c1.exibirDetalhes();

        System.out.println();

        m1.mostrarDetalhes();

        List<Veiculo> minhaFrota = new ArrayList<Veiculo>();

        minhaFrota.add(c1);
        minhaFrota.add(m1);

        System.out.println(minhaFrota);

        //Deu certo porque carro e moto são tipos de veículo, então naturalmente funciona!

    }
}

