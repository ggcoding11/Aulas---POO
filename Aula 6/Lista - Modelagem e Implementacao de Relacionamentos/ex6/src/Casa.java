public class Casa {
    String endereco;

    Comodo[] comodos;

    Casa(String endereco, String nomeComodo){
        this.endereco = endereco;
        comodos[0] = new Comodo(nomeComodo);
    }

}
